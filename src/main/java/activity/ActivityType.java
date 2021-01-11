  package activity;

public enum ActivityType {
    BIKING(0), HIKING(1), RUNNING(2), BASKETBALL(3);

    private final int activityTrackCode;

    ActivityType(int activityTrackCode) {
        this.activityTrackCode = activityTrackCode;
    }

    public int getActivityTrackCode() {
        return activityTrackCode;
    }

    private static ActivityType[] listOfTypes = ActivityType.values();

    public static ActivityType getActivityType(int i){
        return listOfTypes[i];
    }

    public static void main(String[] args) {
        System.out.println(ActivityType.getActivityType(2));
    }
}




