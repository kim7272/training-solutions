package week13d04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class TemplateMerger {

    Path file = Path.of("employeeForm.txt");

    public String merge(Path file, List<Employee> employees){

        StringBuilder sb = new StringBuilder();

        try {
            String form = Files.readString(file);
            String[] formParts = form.split(",");
            String[] newFormParts = new String[2];

            for (Employee employee : employees) {
              newFormParts[0] =  formParts[0].replace("{nev}", employee.getName() + ",");
              newFormParts[1] =  formParts[1].replace("{ev}", employee.getDateOfBirth());
                //System.out.println(newFormParts[0] + newFormParts[1]);
                sb.append(newFormParts[0] + newFormParts[1] + "\n");
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not read file!");
        }
        String result = sb.toString().trim();
        return result;
    }

    public static void main(String[] args) {
        Path file = Path.of("employeeForm.txt");
        System.out.println(new TemplateMerger().merge(file, Arrays.asList(new Employee("John Doe","1980"),
                new Employee("Jack Doe","1990"))));
    }
}


