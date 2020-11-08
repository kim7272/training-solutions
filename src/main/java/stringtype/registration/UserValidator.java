package stringtype.registration;

public class UserValidator {
    String username;
    String password1;
    String password2;
    String email;

    public UserValidator (String username, String password1, String password2, String email) {
        this.username = username;
        this.password1 = password1;
        this.password2 = password2;
        this.email = email;
    }
    public boolean isValidUsername(String username){
        return !(username.equals(""))& !(username.equals(" ")) & !(username.equals("  "))& !(username.equals("   "));
    }

    public boolean isValidPassword(String password1, String password2) {
        return ((password1.length() >=8)) && ((password1.length() >=8) && (password1.equals(password2)));
    }

    public boolean isValidEmail(String email) {
        int atIndex = email.indexOf("@");
        int pointIndex = email.indexOf(".", atIndex);
        return !(atIndex == -1) && !(pointIndex == -1) && !(atIndex == 0) && !(pointIndex == email.length()-1);



    }
}
