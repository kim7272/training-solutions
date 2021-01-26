package collectionsqueue.job;

public class Job implements  Comparable<Job> {

    private final int priority;
    private final String jobDescription;
    private final boolean urgent;

    public Job(int priority, String jobDescription) {
        this.priority = priority;
        this.jobDescription = jobDescription;
        if (priority < 5) {
            this.urgent = true;
        } else {
            this.urgent = false;
        }
    }

    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }

    @Override
    public int compareTo(Job o) {
        if (priority == o.priority) {
            return 0;
        } else if (priority > o.priority) {
            return 1;
        } else {
            return -1;
        }
    }
}
