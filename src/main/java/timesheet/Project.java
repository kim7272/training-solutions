package timesheet;

public final class Project {

    private String name;

    @Override
    public String toString() {
        return  name;
    }

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}



