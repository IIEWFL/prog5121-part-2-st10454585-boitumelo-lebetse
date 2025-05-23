import java.util.Scanner;
import PROG_1.Login;


/*
 *This code was developed with assistance from ChatGPT,
 * and references were made to the following online resources:
 * - W3Schools Java Tutorial: https://www.w3schools.com/java
 * - freeCodeCamp - Java Unit Testing: https://www.freecodecamp.org/news/java-unit-testing/
 */
public class PROG_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();

        System.out.println("=== User Registration ===");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        //username
        String username;
        while (true) {
            System.out.print("Enter Username: ");
            username = scanner.nextLine();
            if (login.checkUserName(username)) {
                System.out.println("Username successfully captured.");
                break;
            } else {
                System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.");
            }
        }

        //password
        String password;
        while (true) {
            System.out.print("Enter Password: ");
            password = scanner.nextLine();
            if (login.checkPasswordComplexity(password)) {
                System.out.println("Password successfully captured.");
                break;
            } else {
                System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
            }
        }
        //cellphone number

        String cellphone;
        while (true) {
            System.out.print("Enter Cellphone Number (+27...): ");
            cellphone = scanner.nextLine();
            if (login.checkCellPhoneNumber(cellphone)) {
                System.out.println("Cellphone number successfully captured.");
                break;
            } else {
                System.out.println("Cellphone number is incorrectly formatted. It must start with +27 and be followed by 10 digits.");
            }
        }

        //coding our if statement here!
        String registrationResult = login.registerUser(username, password, firstName, lastName);
        System.out.println(registrationResult);

        if (registrationResult.equals("Registration successful")) {
            System.out.println("\n=== Login ===");
            System.out.print("Enter Username: ");
            String enteredUsername = scanner.nextLine();

            System.out.print("Enter Password: ");
            String enteredPassword = scanner.nextLine();

            String loginStatus = login.returnLoginStatus(enteredUsername, enteredPassword);
            System.out.println(loginStatus);
        }

        scanner.close();
    }
}

