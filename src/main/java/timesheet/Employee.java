package timesheet;

public final class Employee {

    private String firstname;
    private String lastname;


    public String getName() {
        return firstname + " " +  lastname;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
