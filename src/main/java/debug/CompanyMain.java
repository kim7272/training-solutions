
package debug;

import java.util.ArrayList;
import java.util.List;

    public class CompanyMain {

        public static void main(String[] args) {
            Employee employee1 = new Employee("Bill Boe", 1976);
            Employee employee2 = new Employee("Roger Row", 1963);
            Employee employee3 = new Employee("Deck Doe", 1958);

            Company company = new Company(new ArrayList<>());

            company.addEmployee(employee1);
            company.addEmployee(employee2);
            company.addEmployee(employee3);

            Employee bill = company.findEmployeeByName("Bill Boe");
            System.out.println(bill.getName() + " " + bill.getYearOfBirth());

            List<String> names = company.listEmployeeNames();
            System.out.println(names);
        }
    }

