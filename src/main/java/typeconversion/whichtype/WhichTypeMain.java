package typeconversion.whichtype;

public class WhichTypeMain {
    public static void main(String[] args) {

        WhichType whichType = new WhichType();

        System.out.println(whichType.whichType("18"));
        System.out.println(whichType.whichType("32500"));
        System.out.println(whichType.whichType("325895"));
        System.out.println(whichType.whichType("3258958547"));

    }
}