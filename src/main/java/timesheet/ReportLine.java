package timesheet;

public class ReportLine {

    private Project project;
    private long time;


    @Override
    public String toString() {
        return project + " " +  time;
    }

    public ReportLine(Project project, long time) {
        this.project = project;
        this.time = time;
    }

    public Project getProject() {
        return project;
    }

    public long getTime() {
        return time;
    }

    public void addTime(long i) {
        time = time + i;
    }
}
