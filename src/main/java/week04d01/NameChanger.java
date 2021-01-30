package week04d01;

public class NameChanger {

    private String fillName;

    public boolean isEmptyOrNull(String string){

        return (string == null) || (string.isEmpty());
    }

    public NameChanger(String fillName) {

        if (isEmptyOrNull(fillName)){
            throw new IllegalArgumentException("Invalid name " + fillName + "!");
        }
        this.fillName = fillName;
    }

    public String changeFirstName(String firstName){

        String[] names = fillName.split(" ");
        names[0] = firstName;
        return names[0] + " " + names[1];
    }

    @Override
    public String toString() {
        return fillName;
    }

    public static void main(String[] args) {

        String name = "Kovács Béla";
        String[] names = name.split(" ");
        System.out.println(names[0]);
    }
}
