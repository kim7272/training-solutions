package attributes.person;

public class PersonMain {


    public static void main(String[] args) {

        PersonMain personMain = new PersonMain();
        Address address = new Address("USA", "Detroit","Third Avenue 32","US-4576");
        Person person = new Person("Bob Dole", "123-456-abc");

        person.moveTo(address);

        System.out.println(person.personToString());
        System.out.println(person.getAddress().addressToString());

        person.correctData("Bill Biden", "456-123-cba");
        System.out.println(person.personToString());

        person.getAddress().correctData("United Kingdom", "Manchester", "Glasgow str. 25", "UK-1117");

        System.out.println(person.getAddress().addressToString());

        Address newAddress = new Address("Germany", "Essen", "Hildegard Str. 25",  "D-2299");

        person.moveTo(newAddress);

        System.out.println(person.getAddress().addressToString());
    }
}
