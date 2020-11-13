package intromethods;

public class Employee {

    private String name;
    private int hiringYear;
    private int salary;

    public Employee(String name, int hiringYear, int salary){
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getHiringYear(){
        return  hiringYear;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public void raiseSalary(int increase){
        this.salary = this.salary + increase;
    }
    @Override
    public String toString(){
        return "Név: " + this.name + ", Belépés éve: " + this.hiringYear + ", Fizetés: " + this.salary;
    }

}

