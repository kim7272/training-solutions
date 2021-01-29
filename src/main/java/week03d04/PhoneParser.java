package week03d04;

public class PhoneParser {

    private Phone phone;

    public Phone parse(String string){

        String[] numbers = string.split("-");

        return new Phone(numbers[0],numbers[1]);
    }
}
