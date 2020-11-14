package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {
        Person person_1;
        Person person_2;

        person_1 = new Person("John Doe", 38);
        person_2 = person_1;
        person_2.setName("Bob Moore");

        System.out.println(person_1);
        System.out.println(person_2);

        int a = 24;
        int b = a;
        b = b + 1;

        System.out.println(a);
        System.out.println(b);

        Person person_3 = new Person("Deed Crown", 59);
        person_1 = person_3;
        System.out.println(person_1);
        System.out.println(person_3);

    }
}