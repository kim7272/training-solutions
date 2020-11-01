package classstructuremethods;

public class Client {

    private String name;
    private int year;
    private String address;

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public String getAddress() {
        return address;
    }
    public void changeName(String newName) {
        name = newName;
    }
    public void changeYear(int newYear) {
        year = newYear;
    }
    public void changeAddress(String newAddress) {
        address = newAddress;
    }
    public void migrate(String address) {
        this.address = address;
    }
}
