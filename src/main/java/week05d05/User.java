package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        if (email.contains(".") && email.contains("@")){
            this.email = email;
        }
       else {
          throw new IllegalArgumentException("Invalid email!");
       }
    }

    public String getFullName(){
        String fullName = firstName + " " + lastName;
        return fullName;
    }
    public String getEmail(){
        return email;
    }
}
