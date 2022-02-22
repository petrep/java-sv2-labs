package activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ActivityDaoTest {

    ActivityDao dao;

    @BeforeEach
    void setUp() throws SQLException {
        MariaDbDataSource dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3308/activitytracker?useUnicode=true&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");

        Flyway fw = Flyway.configure().dataSource(dataSource).load();
        fw.clean();
        fw.migrate();

        dao = new ActivityDao(dataSource);

        Activity activity1 = new Activity(LocalDateTime.of(2021, 2, 22, 15, 35), "futás a parkban", ActivityType.RUNNING);
        dao.saveActivity(activity1);
        Activity activity2 = new Activity(LocalDateTime.of(2020, 8, 10, 11, 12), "Egész héten Zemplén!!!", ActivityType.HIKING);
        dao.saveActivity(activity2);

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

        Assertions.assertEquals(2, activities.size());
        Assertions.assertEquals(LocalDateTime.of(2020, 8, 10, 11, 12), activities.get(1).getStartTime());
        Assertions.assertEquals("Egész héten Zemplén!!!", activities.get(1).getDescription());
        Assertions.assertEquals(ActivityType.HIKING, activities.get(1).getType());
    }


}