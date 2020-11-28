package stringconcat.employee;

public class Employee {

    private String name;
    private String job;
    private int salary;

    public Employee(String name, String job, int salary){

        if (name == "" || name == null) {
            throw new IllegalArgumentException("Name must not be empty.");
        }
        this.name = name;

        if (job == "" || job == null) {
            throw new IllegalArgumentException("Job must not be empty.");
        }
        this.job = job;

        if ((Integer.toString(salary) == "") || salary == 0) {
            throw new IllegalArgumentException("Salary must not be empty or 0.");
        }
        if (salary < 0){
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        String complete = name + " - " + job + " - " + salary + " " + "Ft";
        return complete;
    }
}
