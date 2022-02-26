package activitytracker_jdbcTemplate;

//import com.mysql.jdbc.jdbc2.optional.MySQLDataSource;
//import org.mariadb.jdbc.MySQLDataSource;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;


import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ActivityTrackerMain {
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        Activity activity1 = new Activity(LocalDateTime.of(2021, 2, 22, 5, 35), "Morning run", ActivityType.RUNNING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 4, 12, 15, 15), "Afternoon basketball", ActivityType.BASKETBALL);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 1, 2, 20, 35), "Evening biking", ActivityType.BIKING);
        Activity activity4 = new Activity(LocalDateTime.of(2021, 5, 8, 10, 25), "Morning hiking", ActivityType.HIKING);

//        use mysql;
//        create schema if not exists activitytracker_jdbcTemplate default character set utf8 collate utf8_hungarian_ci;


        // Task: to create the 'activities' table in the db manually, I am going to use this command:
        // CREATE TABLE activities (id INT AUTO_INCREMENT, start_time DATETIME, description VARCHAR(250), activity_type VARCHAR(10), PRIMARY KEY (id));
        List<Activity> activities = new ArrayList<>();

        activities.add(activity1);
        activities.add(activity2);
        activities.add(activity3);
        activities.add(activity4);

//        System.setProperty("https.protocols", "TLSv1");
        MysqlDataSource dataSource;

        dataSource = new MysqlDataSource();
//        dataSource.setUrl("jdbc:mysql://localhost:3308/activitytracker?useUnicode=true&?ServerRSAPublicKeyFile=/var/lib/mysql/public_key.pem");
//        dataSource.setUrl("jdbc:mysql://localhost:3308/activitytracker?useUnicode=true&useSSL=true");
        dataSource.setUrl("jdbc:mysql://localhost:3308/activitytracker_jdbcTemplate?useUnicode=true&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");
//        dataSource.setUser("root");
//        dataSource.setPassword("password");
        // I realized that if docker is used, I have to change the ip address:
        // FROM:  create user 'activitytracker'@'localhost' identified by 'activitytracker';
        // TO:    create user 'activitytracker'@'172.17.0.1' identified by 'activitytracker';
        //        grant all on *.* to 'activitytracker'@'172.17.0.1';

        ActivityTrackerMain main = new ActivityTrackerMain();
        main.jdbcTemplate = new JdbcTemplate(dataSource);
        main.cleanupDatabase(dataSource);
        main.registerActivitiesInDatabase(dataSource, activities);

        List<Activity> allActivities = main.listActivities(dataSource);
        for (Activity activity : allActivities) {
            Optional<Activity> actualActivity = main.findActivityById(dataSource, activity.getId());
            System.out.println(actualActivity.get().getId());
            System.out.println(actualActivity.get().getDescription());
        }
    }

    private Optional<Activity> findActivityById(DataSource dataSource, int id) {
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?;")) {
//            stmt.setInt(1, id);
//            ResultSet rs = stmt.executeQuery();
//
//            return getResult(rs);
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot query.", sqle);
//        }
        //jdbcTemplate.query(SQL_GET_ALL, new PersonMapper());
        return Optional.of(jdbcTemplate.queryForObject("SELECT * FROM activities WHERE id = ?", (rs, rowNum) -> new Activity(
                rs.getInt("id"),
                rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("description"),
                ActivityType.valueOf(rs.getString("activity_type"))), id));
    }

//    private Optional<Activity> getResult(ResultSet rs) throws SQLException {
//        if (rs.next()) {
//            int foundId = rs.getInt("id");
//            LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
//            String description = rs.getString("description");
//            ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
//            Activity activity = new Activity(foundId, startTime, description, type);
//            rs.close();
//            return Optional.of(activity);
//        } else {
//            rs.close();
//            return Optional.empty();
//        }
//    }

    private List<Activity> listActivities(MysqlDataSource dataSource) {
//        try (Connection conn = dataSource.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("select * from activities;")) {
//
//            return listDBActivities(rs);
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot query.", sqle);
//        }
        System.out.println("listActivities method starts..");
        return jdbcTemplate.query("SELECT * FROM activities",
                (rs, rowNum) -> new Activity(rs.getInt("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("description"),
                        ActivityType.valueOf(rs.getString("activity_type"))));
    }

//    private List<Activity> listDBActivities(ResultSet rs) throws SQLException {
//        System.out.println("listDBActivities method starts..");
//        List<Activity> activities = new ArrayList<>();
//        while (rs.next()) {
//            int foundId = rs.getInt("id");
//            LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
//            String description = rs.getString("description");
//            ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
//            activities.add(new Activity(foundId, startTime, description, type));
//        }
//        return activities;
//    }

    private void cleanupDatabase(MysqlDataSource dataSource) {
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement("truncate table activities;")) {
//            stmt.execute();
//
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot insert.", sqle);
//        }
        jdbcTemplate.update(
                "truncate table activities;");
    }

    private void registerActivitiesInDatabase(MysqlDataSource dataSource, List<Activity> activities) {
        System.out.println("registerActivitiesInDatabase method starts..");
        activities.forEach(activity ->
                jdbcTemplate.update(
                        "INSERT INTO activities (start_time, description, activity_type) VALUES (?, ?, ?)",
                        activity.getStartTime(), activity.getDescription(), activity.getType().toString()));
    }
}
