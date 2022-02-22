package activitytracker;

//import com.mysql.jdbc.jdbc2.optional.MySQLDataSource;
//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

//import org.mariadb.jdbc.MySQLDataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        Activity activity1 = new Activity(LocalDateTime.of(2021, 2, 22, 5, 35), "Morning run", ActivityType.RUNNING);
        Activity activity2 = new Activity(LocalDateTime.of(2021, 4, 12, 15, 15), "Afternoon basketball", ActivityType.BASKETBALL);
        Activity activity3 = new Activity(LocalDateTime.of(2021, 1, 2, 20, 35), "Evening biking", ActivityType.BIKING);
        Activity activity4 = new Activity(LocalDateTime.of(2021, 5, 8, 10, 25), "Morning hiking", ActivityType.HIKING);

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
        dataSource.setUrl("jdbc:mysql://localhost:3308/activitytracker?useUnicode=true&allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC");
        dataSource.setUser("activitytracker");
        dataSource.setPassword("activitytracker");
//        dataSource.setUser("root");
//        dataSource.setPassword("password");
        // I realized that if docker is used, I have to change the ip address:
        // FROM:  create user 'activitytracker'@'localhost' identified by 'activitytracker';
        // TO:    create user 'activitytracker'@'172.17.0.1' identified by 'activitytracker';
        //        grant all on *.* to 'activitytracker'@'172.17.0.1';

        ActivityTrackerMain main = new ActivityTrackerMain();
        main.registerActivitiesInDatabase(dataSource, activities);
//        main.cleanupDatabase(dataSource);

    }

    private void cleanupDatabase(MysqlDataSource dataSource) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM activities;")) {
             stmt.execute();

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert.", sqle);
        }
    }

    private void registerActivitiesInDatabase(MysqlDataSource dataSource, List<Activity> activities) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?);")) {
            for (Activity activity : activities) {
                stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
                stmt.setString(2, activity.getDescription());
                stmt.setString(3, activity.getType().toString());
                stmt.executeUpdate();
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert.", sqle);
        }

    }
}
