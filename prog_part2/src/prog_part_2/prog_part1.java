package prog_part_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * GROK AI was used to help me fix complex bug/errors in my code,
 * and references were made to the following online resources:
 * - W3Schools Java Tutorial: https://www.w3schools.com/java
 * - freeCodeCamp - Java Unit Testing: https://www.freecodecamp.org/news/java-unit-testing/
 * - GeeksforGeeks Java Programming: https://www.geeksforgeeks.org/java/
 * - Oracle Java Documentation: https://docs.oracle.com/javase/tutorial/
 */


public class prog_part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Login login = new Login();
        Message message = new Message();

        System.out.println("=== User Registration ===");

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

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

        String cellphone;
        while (true) {
            System.out.print("Enter Cellphone Number (+27...): ");
            cellphone = scanner.nextLine();
            if (login.checkCellPhoneNumber(cellphone)) {
                System.out.println("Cellphone number successfully captured.");
                break;
            } else {
                System.out.println("Cellphone number is incorrectly formatted. It must start with +27 and be followed by 9-10 digits (max 12 chars total).");
            }
        }

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

            if (loginStatus.startsWith("Welcome")) {
                System.out.println("\nWelcome to QuickChat.");
                int choice;
                do {
                    System.out.println("\nMenu:");
                    System.out.println("1) Send Messages");
                    System.out.println("2) Show recently sent messages");
                    System.out.println("3) Quit");
                    System.out.print("Enter your choice: ");
                    choice = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (choice == 1) {
                        System.out.print("Enter the number of messages to send: ");
                        int numMessages = scanner.nextInt();
                        scanner.nextLine();
                        List<String> messageDetailsList = new ArrayList<>();
                        for (int i = 0; i < numMessages; i++) {
                            System.out.print("Enter Message ID (max 10 chars): ");
                            String msgId = scanner.nextLine();
                            while (!message.checkMessageID(msgId)) {
                                System.out.print("Message ID too long, enter again (max 10 chars): ");
                                msgId = scanner.nextLine();
                            }

                            System.out.print("Enter Recipient Number (starts with +27, max 12 chars): ");
                            String recipient = scanner.nextLine();
                            while (!message.checkRecipientCell(recipient)) {
                                System.out.print("Recipient number invalid, enter again (starts with +27, max 12 chars): ");
                                recipient = scanner.nextLine();
                            }

                            System.out.print("Enter Message (max 250 chars): ");
                            String msg = scanner.nextLine();

                            String msgHash = message.createMessageHash(msgId, msg);
                            System.out.print("Send (1), Discard (2), Store (3): ");
                            int action = scanner.nextInt();
                            scanner.nextLine(); // Consume newline
                            String result = message.sendMessage(msgId, recipient, msg, msgHash, action);
                            System.out.println(result);
                            if (!result.contains("exceeds")) {
                                messageDetailsList.add(message.printMessages().trim());
                            }
                        }
                        if (!messageDetailsList.isEmpty()) {
                            System.out.println("Message details:");
                            JOptionPane.showMessageDialog(null, String.join("\n", messageDetailsList));
                        }
                        System.out.println("Total messages sent: " + message.returnTotalMessages());
                    } else if (choice == 2) {
                        System.out.println("Coming Soon.");
                    }
                } while (choice != 3);
            }
        }

        scanner.close();
    }
}