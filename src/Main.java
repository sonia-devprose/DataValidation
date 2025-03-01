//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.println("Enter your email");
        String email = scanner.next();
        System.out.println("Enter your phone number");
        String number = scanner.next();
        System.out.println("Enter your password");
        char[] password = scanner.next().toCharArray();
        System.out.println("You entered the following email: " + email);
        if(isValidMail(email))
        {
            System.out.println("Email is valid.");
        }
        else {
            System.out.println("Email is invalid");
        }

        System.out.println("You entered the following phone number: " + number);
        if(isValidPhoneNumber(number))
        {
            System.out.println("Number is valid.");
        }
        else {
            System.out.println("Number is invalid");
        }

        System.out.println("You entered a password");
        if(isValidPassword(password))
        {
            System.out.println("Password is valid.");
        }
        else {
            System.out.println("Password is invalid");
        }

    }
        public static boolean isValidMail( String email)
        {
            String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
            return (email.matches(emailRegex));
        }

    public static boolean isValidPhoneNumber( String number)
    {
        String numberRegex = "^(\\+\\d{1,3})?\\d{10}$";
        return (number.matches(numberRegex));
    }

    public static boolean isValidPassword(char[] password)
    {
        String passwordString = new String(password);
        String passwordRegex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$";
        return(passwordString.matches(passwordRegex));
    }
    }


