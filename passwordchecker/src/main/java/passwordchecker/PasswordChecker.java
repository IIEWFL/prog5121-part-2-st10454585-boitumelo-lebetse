package passwordchecker;

import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner inputDevice = new Scanner(System.in);

        System.out.println("Enter your username => ");
        String username = inputDevice.nextLine();

        System.out.println("Enter your password => ");
        String password = inputDevice.nextLine();

        do {

            if (!password.equals("Steven123")) {
                System.out.println("Wrong passowrd");
                System.out.println("Enter your password => ");
                password = inputDevice.nextLine();
            }

        } while (!password.equals("Steven123"));

        System.out.println("Access granted");
    }

}