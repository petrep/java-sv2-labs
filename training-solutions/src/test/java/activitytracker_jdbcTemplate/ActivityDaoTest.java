package activitytracker_jdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ActivityDaoTest {

//    private DataSource dataSource;

    activitytracker_jdbcTemplate.ActivityDao dao;

    @BeforeEach
    void setUp() throws SQLException {
//        MariaDbDataSource dataSource = new MariaDbDataSource();
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3308/activitytracker_jdbcTemplate?useUnicode=true&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

//        Flyway fw = Flyway.configure().locations("db/migration").load();
        Flyway fw = Flyway.configure().dataSource(dataSource).load();
        fw.clean();
        fw.migrate();

        dao = new ActivityDao(dataSource);

        Activity activity1 = new Activity(LocalDateTime.of(2021, 2, 22, 15, 35), "futás a parkban", ActivityType.RUNNING);
        dao.saveActivity(activity1);
        Activity activity2 = new Activity(LocalDateTime.of(2020, 8, 10, 11, 12), "Egész héten Zemplén!!!", ActivityType.HIKING);
        dao.saveActivity(activity2);

        Activity activity3 = new Activity(LocalDateTime.of(2020, 10, 2, 8, 15), "egész napos bicótúra", ActivityType.BIKING);
        dao.saveActivity(activity3);
        Activity activity4 = new Activity(LocalDateTime.of(2021, 1, 22, 9, 46), "meccs az iskola tornatermében", ActivityType.BASKETBALL);
        dao.saveActivity(activity4);
        Activity activity5 = new Activity(LocalDateTime.of(2020, 12, 22, 7, 52), "kis kör a tó körül", ActivityType.RUNNING);
        dao.saveActivity(activity5);

    }

    @Test
    void testFindActivityById() {
        Activity activity = dao.findActivityById(2);

        Assertions.assertEquals(LocalDateTime.of(2020, 8, 10, 11, 12), activity.getStartTime());
        Assertions.assertEquals("Egész héten Zemplén!!!", activity.getDescription());
        Assertions.assertEquals(ActivityType.HIKING, activity.getType());
    }

    @Test
    void testListActivities() {
        List<Activity> activities = dao.listActivities();

        Assertions.assertEquals(5, activities.size());
        Assertions.assertEquals(LocalDateTime.of(2020, 8, 10, 11, 12), activities.get(1).getStartTime());
        Assertions.assertEquals("Egész héten Zemplén!!!", activities.get(1).getDescription());
        Assertions.assertEquals(ActivityType.HIKING, activities.get(1).getType());
    }

    @Test
    void testSaveActivityAndReturnGeneratedKeys() {
        Activity activity = new Activity(LocalDateTime.of(2021, 2, 23, 9, 56), "séta a kertben a napon", ActivityType.RUNNING);
        Activity expected = dao.saveActivityAndReturnGeneratedKeys(activity);

        Assertions.assertEquals(6, expected.getId());
    }

    @Test
    void testSaveActivitywithTrackPointsEverythingIsOK() {
        TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
        TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
        TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 18.5472280);
        TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
        TrackPoint trackPoint5 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302552, 18.5472312);
        List<TrackPoint> trackpoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4, trackPoint5);
        Activity activity = new Activity(LocalDateTime.of(2020, 12, 14, 15, 30), "laza délutáni futás", ActivityType.RUNNING, trackpoints);

        dao.saveActivityAndSaveTrackPoints(activity);
        Activity expected = dao.findActivityWithTrackPointsById(6);

        Assertions.assertTrue(activity.getStartTime().equals(expected.getStartTime()));
        Assertions.assertTrue(activity.getDescription().equals(expected.getDescription()));
        Assertions.assertTrue(activity.getType().equals(expected.getType()));
        Assertions.assertTrue(activity.getTrackpoints().size() == expected.getTrackpoints().size());
        Assertions.assertTrue(expected.getTrackpoints().equals(trackpoints));
    }

    @Test
    void testSaveActivitywithTrackPointsSomethingIsWrong() {
        TrackPoint trackPoint1 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181020, 18.5411940);
        TrackPoint trackPoint2 = new TrackPoint(LocalDate.of(2021, 2, 24), 47.2181230, 18.5411780);
        TrackPoint trackPoint3 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302470, 15238.5472280);
        TrackPoint trackPoint4 = new TrackPoint(LocalDate.of(2020, 12, 14), 47.2302550, 18.5472310);
        List<TrackPoint> trackpoints = Arrays.asList(trackPoint1, trackPoint2, trackPoint3, trackPoint4);
        Activity activity = new Activity(LocalDateTime.of(2020, 12, 14, 15, 30), "laza délutáni futás", ActivityType.RUNNING, trackpoints);

        Exception ex1 = Assertions.assertThrows(IllegalArgumentException.class, () -> dao.saveActivityAndSaveTrackPoints(activity));
        Assertions.assertEquals("Transaction not succeeded!", ex1.getMessage());

        Exception ex2 = Assertions.assertThrows(IllegalArgumentException.class, () -> dao.findActivityWithTrackPointsById(7));
        Assertions.assertEquals("No activity with this id.", ex2.getMessage());
    }

}
