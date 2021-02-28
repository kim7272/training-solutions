package activitytracker;

import java.time.LocalDateTime;

public class Activity {

    private int id;
    private LocalDateTime  startTime;
    private String desc;
    private ActivityType type;

    public Activity(LocalDateTime startTime, String desc, ActivityType type) {
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public Activity(int id, LocalDateTime startTime, String desc, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    @Override
    public String toString() {
        return startTime + ", " + desc + ", " + type;
    }

    public int getId() {
        return id;
    }



    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }
}
