package attributes.person;

public class Person {

    private String name;
    private String identificationCard;
    private Address address;


    public Person(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String getName() {
        return name;
    }
    public String getIdentificationCard(){
        return identificationCard;
    }
    public void moveTo(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }

    public void correctData(String name, String identificationCard){
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public String personToString() {
        String data = getName() +", " + getIdentificationCard();
        return data;
    }
}
