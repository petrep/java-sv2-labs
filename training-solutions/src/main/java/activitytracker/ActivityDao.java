package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource dataSource;

    public ActivityDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void saveActivity(Activity activity) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?);")) {
            setStatementParametersByActivity(activity, stmt);
            stmt.executeUpdate();
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert.", sqle);
        }
    }

    private void setStatementParametersByActivity(Activity activity, PreparedStatement stmt) throws SQLException {
        stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        stmt.setString(2, activity.getDescription());
        stmt.setString(3, activity.getType().toString());
    }

    public Activity findActivityById(long id) {
        try (Connection conn = dataSource.getConnection();
             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?;")) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            return returnActivityIfFound(rs);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query.", sqle);
        }
    }

    private Activity returnActivityIfFound(ResultSet rs) throws SQLException {
        if (rs.next()) {
            int foundId = rs.getInt("id");
            LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
            String description = rs.getString("description");
            ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));

            return new Activity(foundId, startTime, description, type);
        }
        throw new IllegalStateException("Activity with this id not found.");
    }

    public List<Activity> listActivities() {
        try (Connection conn = dataSource.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select * from activities;")) {

            return getActivities(rs);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot query.", sqle);
        }
    }

    private List<Activity> getActivities(ResultSet rs) throws SQLException {
        List<Activity> activities = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
            String description = rs.getString("description");
            ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
            activities.add(new Activity(id, startTime, description, type));
        }

        return activities;
    }

}
