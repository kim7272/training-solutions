package introinheritance.employee;

public class Boss extends Employee{

    public static final double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees){
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }
    public double getSalary(){
        return super.getSalary() + this.getNumberOfEmployees()*LEADERSHIP_FACTOR*super.getSalary();
    }
    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

}
