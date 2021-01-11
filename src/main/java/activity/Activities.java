  package activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Activities {

    private List<Activity> activities;

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (Activity activity : this.activities) {
                double distance = 0.0;
                if (activity.getType().getActivityTrackCode() == i) {
                    distance = distance + activity.getDistance();
                }
                result.add(new Report(ActivityType.getActivityType(i), distance));
            }
        }
        return result;
    }

    public int numberOfTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (activity.getType().getActivityTrackCode() < 3) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int numberOfWithoutTrackActivities() {
        int counter = 0;
        for (Activity activity : activities) {
            if (activity.getType().getActivityTrackCode() >= 3) {
                counter = counter + 1;
            }
        }
        return counter;
    }

}

    public static void main(String[] args) {
        Track track = new Track();

        Activities activities = new Activities(Arrays.asList(
                new ActivityWithTrack(track, ActivityType.RUNNING),
                new ActivityWithoutTrack(ActivityType.BASKETBALL),
                new ActivityWithTrack(track, ActivityType.RUNNING)));

    }
}





