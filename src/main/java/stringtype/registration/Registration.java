package stringtype.registration;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adja meg a felhasználónevet!");
        String username = scanner.nextLine();

        System.out.println("Adja meg a jelszót!");
        String password1 = scanner.nextLine();

        System.out.println("Adja meg még egyszer a jelszót!");
        String password2 = scanner.nextLine();

        System.out.println("Adja meg az email címet!");
        String email = scanner.nextLine();

        UserValidator uservalidator = new UserValidator(username, password1, password2, email);

        String user = uservalidator.isValidUsername(username) ? "Helyes felhasználónév!" : "Helytelen felhasználónév!";
        String pass = uservalidator.isValidPassword(password1, password2) ? "Helyes jelszó!" : "Helytelen jelszó!";
        String mail = uservalidator.isValidEmail(email) ? "Helyes email cím!" : "Helytelen email cím!";

        System.out.println(user);
        System.out.println(pass);
        System.out.println(mail);


    }
}
