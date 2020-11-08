package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime beginEmployment;

    public Employee(int year, int month, int day, String name) {
        this.name = name;
        this.dateOfBirth = LocalDate.of(year, month, day);
    }
    public LocalDate getDateOfBirth() {
        dateOfBirth = this.dateOfBirth;
        return dateOfBirth;
    }
    public String getName() {
        return name;
    }
    public LocalDateTime getBeginEmployment(LocalDateTime now) {
        beginEmployment = LocalDateTime.now();
        return beginEmployment;
    }
    public void setName(String name) {
        this.name = name;
    }

}

