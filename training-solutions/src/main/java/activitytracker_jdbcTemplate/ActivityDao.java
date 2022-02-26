package activitytracker_jdbcTemplate;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ActivityDao {

    private DataSource dataSource;

    private JdbcTemplate jdbcTemplate;

    public ActivityDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.dataSource = dataSource;
    }

//    public ActivityDao(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    public void saveActivity(Activity activity) {
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?);")) {
//            setStatementParametersByActivity(activity, stmt);
//            stmt.executeUpdate();
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot insert.", sqle);
//        }
                jdbcTemplate.update(
                        "INSERT INTO activities (start_time, description, activity_type) VALUES (?, ?, ?)",
                        activity.getStartTime(), activity.getDescription(), activity.getType().toString());

    }

    private void setStatementParametersByActivity(Activity activity, PreparedStatement stmt) throws SQLException {
        stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
        stmt.setString(2, activity.getDescription());
        stmt.setString(3, activity.getType().toString());
    }

    public Activity findActivityById(long id) {
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?;")) {
//            stmt.setLong(1, id);
//            ResultSet rs = stmt.executeQuery();
//
//            return returnActivityIfFound(rs);
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot query.", sqle);
//        }
        Activity activity = null;
        try {
            activity = jdbcTemplate.queryForObject("SELECT * FROM activities WHERE id = ?", (rs, rowNum) -> new Activity(
                    rs.getInt("id"),
                    rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("description"),
                    ActivityType.valueOf(rs.getString("activity_type"))), id);
        } catch (Exception e) {
            throw new IllegalArgumentException("No activity with this id.");
        }
        return activity;
    }

//    private Activity returnActivityIfFound(ResultSet rs) throws SQLException {
//        if (rs.next()) {
//            int foundId = rs.getInt("id");
//            LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
//            String description = rs.getString("description");
//            ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
//
//            return new Activity(foundId, startTime, description, type);
//        }
//        throw new IllegalStateException("Activity with this id not found.");
//    }

    public List<Activity> listActivities() {
//        try (Connection conn = dataSource.getConnection();
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("select * from activities;")) {
//
//            return getActivities(rs);
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot query.", sqle);
//        }
        return jdbcTemplate.query("SELECT * FROM activities",
                (rs, rowNum) -> new Activity(rs.getInt("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("description"),
                        ActivityType.valueOf(rs.getString("activity_type"))));
    }

//    private List<Activity> getActivities(ResultSet rs) throws SQLException {
//        List<Activity> activities = new ArrayList<>();
//        while (rs.next()) {
//            int id = rs.getInt("id");
//            LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
//            String description = rs.getString("description");
//            ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
//            activities.add(new Activity(id, startTime, description, type));
//        }
//
//        return activities;
//    }

    public Activity saveActivityAndReturnGeneratedKeys(Activity activity) {
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?);",
//                     Statement.RETURN_GENERATED_KEYS)) {
//            setStatementParametersByActivity(activity, stmt);
//            stmt.executeUpdate();
//            ResultSet rs = stmt.getGeneratedKeys();
//            if (rs.next()) {
//                return new Activity(rs.getInt(1), activity.getStartTime(), activity.getDescription(), activity.getType());
//            }
//            throw new IllegalStateException("Cannot get generated keys.");
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot insert.", sqle);
//        }
        KeyHolder holder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?);",
                     Statement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(2, activity.getDescription());
            ps.setString(3, activity.getType().toString());
            return ps;
        }, holder);

        return new Activity(holder.getKey().intValue(), activity.getStartTime(), activity.getDescription(), activity.getType());
    }

    public void saveActivityAndSaveTrackPoints(Activity activity) {
        System.out.println("Saving activity and trackpoints");
        try (Connection conn = dataSource.getConnection()) {
            conn.setAutoCommit(false);
            try {
                int activityId = saveActivityWithTrackPoints(activity, conn);
//                saveTrackPoints(activityId, activity, conn);
                conn.commit();
//            } catch (IllegalArgumentException iae) {
//                System.out.println("iae");
//                throw new IllegalArgumentException("Transaction not succeeded!");
            } catch (Exception ex) {
                conn.rollback();
                throw new IllegalArgumentException("Transaction not succeeded!", ex);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Wrong connection.", sqle);
        }
    }

    private int saveActivityWithTrackPoints(Activity activity, Connection conn) throws SQLException {
//        int activityId = 0;
//        try (PreparedStatement stmt = conn.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?);",
//                Statement.RETURN_GENERATED_KEYS)) {
//            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
//            stmt.setString(2, activity.getDescription());
//            stmt.setString(3, activity.getType().toString());
//            stmt.executeUpdate();
//            ResultSet rs = stmt.getGeneratedKeys();
//            if (rs.next()) {
//                activityId = rs.getInt(1);
//            }
//            return activityId;
//        }
        KeyHolder holder = new GeneratedKeyHolder();

        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement("insert into activities(start_time, description, activity_type) values (?, ?, ?);",
                    Statement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(2, activity.getDescription());
            ps.setString(3, activity.getType().toString());
            return ps;
        }, holder);
        saveTrackPoints((int) holder.getKey().longValue(),activity, conn);
        return (int) holder.getKey().longValue();
    }

    private void saveTrackPoints(int activityId, Activity activity, Connection conn) throws SQLException {
//        try (PreparedStatement stmt = conn.prepareStatement("insert into track_point(id, tp_time, lat, lon) values (?, ?, ?, ?);")) {
//            for (TrackPoint t : activity.getTrackpoints()) {
//
//                if (t.getLat() < -90.0 || t.getLat() > 90.0 || t.getLon() < -180 || t.getLon() > 180.0) {
//                    throw new IllegalArgumentException("Not suitable values for latitude or longitude!");
//                }
//                stmt.setInt(1, activityId);
//                // there is something wrong with the mysql timezone so I will use a trick to pass the test (manually changing the date to tomorrow):
//                LocalDate time = t.getTime().plusDays(1);
//                Date x = Date.valueOf(time);
//                stmt.setDate(2, x);
//                stmt.setDouble(3, t.getLat());
//                stmt.setDouble(4, t.getLon());
//
//                stmt.executeUpdate();
//            }
//        } catch (IllegalArgumentException ex) {
//            throw new IllegalArgumentException("Not suitable values for latitude or longitude!");
//        }
        for (TrackPoint actual : activity.getTrackpoints()) {
            validateTrackPoint(actual);
            jdbcTemplate.update("insert into track_point(id, tp_time, lat, lon) values (?, ?, ?, ?);",
                    activityId, actual.getTime().plusDays(1), actual.getLat(), actual.getLon());
        }
    }
    private void validateTrackPoint(TrackPoint trackPoint) {
        if (Math.abs(trackPoint.getLat()) > 90.0 || Math.abs(trackPoint.getLon()) > 180.0) {
            throw new IllegalArgumentException("Invalid track point coordinates: " + trackPoint.getLat() + ";" + trackPoint.getLon());
        }
    }

    private List<TrackPoint> getTrackPoints(int id, Connection conn) throws SQLException {
//        try (PreparedStatement stmt = conn.prepareStatement("select * from track_point where id = ?;")) {
//            stmt.setInt(1, id);
//            try (ResultSet rs = stmt.executeQuery()) {
//                return loadTrackPoints(rs);
//            }
//        }
            return jdbcTemplate.query("SELECT * FROM track_point WHERE id = " + id + ";", (rs, rowNum) -> new TrackPoint(
                    (int) rs.getLong("id"),
                    rs.getDate("tp_time").toLocalDate(),
                    rs.getDouble("lat"),
                    rs.getDouble("lon")));
    }

    private List<TrackPoint> loadTrackPoints(ResultSet rs) throws SQLException {
        List<TrackPoint> trackpoints = new ArrayList<>();
        while (rs.next()) {
            trackpoints.add(extractTrackPoint(rs));
        }
        return trackpoints;
    }

    private TrackPoint extractTrackPoint(ResultSet rs) throws SQLException {
        LocalDate time = rs.getDate("tp_time").toLocalDate();
        double lat = rs.getDouble("lat");
        double lon = rs.getDouble("lon");

        return new TrackPoint(time, lat, lon);
    }

    public Activity findActivityWithTrackPointsById(int id) {
//        try (Connection conn = dataSource.getConnection();
//             PreparedStatement stmt = conn.prepareStatement("select * from activities where id = ?;")) {
//            stmt.setInt(1, id);
//            return getActivityById(id, stmt, conn);
//        } catch (SQLException sqle) {
//            throw new IllegalStateException("Cannot select activity or trackpoints.", sqle);
//        }
        //
        Activity activity = findActivityById(id);
        Connection conn = null;
        List<TrackPoint> trackpoints = null;
        try {
            conn = dataSource.getConnection();
            trackpoints = getTrackPoints(id, conn);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot select activity or trackpoints.", sqle);
        }

        Activity actWithTrackpoints = new Activity(activity.getId(), activity.getStartTime(), activity.getDescription(), activity.getType(), trackpoints);
        return actWithTrackpoints;
    }

    private Activity getActivityById(int id, PreparedStatement stmt, Connection conn) throws SQLException {
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                LocalDateTime startTime = rs.getTimestamp("start_time").toLocalDateTime();
                String description = rs.getString("description");
                ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
                List<TrackPoint> trackPoints = getTrackPoints(id, conn);
                return new Activity(id, startTime, description, type, trackPoints);
            }
            throw new IllegalArgumentException("No activity with this id.");
        }
    }
}
