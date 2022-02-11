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

    public List<Report> distancesByTypes() {
        List<Report> reports = new ArrayList<>();
        for (Activity act: activities) {
            System.out.println(act.getType().toString());
            System.out.println(act.getDistance());
            reports.add(new Report(act.getType(), act.getDistance()));
        }

        return reports;
    }

    public int numberOfTrackActivities() {
        return (int)activities.stream().filter(
                activity -> activity instanceof ActivityWithTrack)
                .count();
//            activity -> activity.getType().equals(ActivityType.BIKING) ||
  //          activity.getType().equals(ActivityType.BASKETBALL) ||
    //        activity.getType().equals(ActivityType.RUNNING) ||
      //      activity.getType().equals(ActivityType.HIKING)
        //return 0;
    }

    public int numberOfWithoutTrackActivities() {
//        return activities.size()-numberOfTrackActivities();
        return (int)activities.stream().filter(
                        activity -> activity instanceof ActivityWithoutTrack)
                .count();
    }


}
