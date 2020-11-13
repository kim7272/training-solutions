package intromethods;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Bob Dole", 2018, 200000);
        System.out.println("Név: " + employee.getName() + ", Belépés éve: " + employee.getHiringYear()+ ", Fizetés: " + employee.getSalary());

        employee.setName("John Bool");
        employee.raiseSalary(100000);
        System.out.println("Név: " + employee.getName() + ", Belépés éve: " + employee.getHiringYear()+ ", Fizetés: " + employee.getSalary());

        System.out.println(employee);
    }
}
