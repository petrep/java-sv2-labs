package activity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Activities {
    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }
//            new ActivityWithTrack(track, ActivityType.RUNNING),
//            new ActivityWithoutTrack(ActivityType.BASKETBALL),
//            new ActivityWithTrack(track, ActivityType.RUNNING)));
    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        for (Activity act: activities) {
            System.out.println(act.getType().toString());
            System.out.println(act.getDistance());
            //reports.add(new Report(act.getType(), act.getDistance()));
//            if (act.getType().equals(ActivityType.BIKING))
        }

        return reports;
    }

    public int numberOfTrackActivities() {
        return (int)activities.stream()
            .filter(activity -> activity instanceof ActivityWithTrack)
            .count();
    }

    public int numberOfWithoutTrackActivities() {
        return (int)activities.stream()
            .filter(activity -> activity instanceof ActivityWithoutTrack)
            .count();
    }

}
