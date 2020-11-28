package introexception.patient;

public class Patient {

    private String name;
    private String socialSecurityNumber;
    private int yearOfBirth;

    public Patient(String name, String ssn, int year) {

        if (name == "") {
            throw new IllegalArgumentException("Field name is empty!");
        }
        this.name = name;
        try {
            int socSecNum = Integer.parseInt(ssn);
            this.socialSecurityNumber = ssn;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid Social Security Number!");
        }
        if (year < 1900) {
            throw new IllegalArgumentException("Year of birth is invalid: " + year);
        }
        this.yearOfBirth = year;
    }

    public String getName() {
        return name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }
}





