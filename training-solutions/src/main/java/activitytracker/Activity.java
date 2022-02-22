package activitytracker;

import java.time.LocalDateTime;

public class Activity {
    private int id;
    private LocalDateTime startTime;
    private String description;
    private ActivityType type;

    public Activity(LocalDateTime startTime, String description, ActivityType type) {
        this.startTime = startTime;
        this.description = description;
        this.type = type;
    }

    public Activity(int id, LocalDateTime startTime, String description, ActivityType type) {
        this(startTime, description, type);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDescription() {
        return description;
    }

    public ActivityType getType() {
        return type;
    }
}
