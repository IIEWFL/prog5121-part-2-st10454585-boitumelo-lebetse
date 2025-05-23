package prog_part_1;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/*
 * This code was developed with assistance from ChatGPT,
 * and references were made to the following online resources:
 * - W3Schools Java Tutorial: https://www.w3schools.com/java
 * - freeCodeCamp - Java Unit Testing: https://www.freecodecamp.org/news/java-unit-testing/
 */
public class UnitTesting {

    Login login = new Login();

    @Test
    public void testCheckUserName() {
        assertTrue(login.checkUserName("user_"));  // Valid
        assertFalse(login.checkUserName("username"));  // Missing _
        assertFalse(login.checkUserName("long_username"));  // Too long
    }

    @Test
    public void testCheckPasswordComplexity() {
        assertTrue(login.checkPasswordComplexity("Pass123!"));  // Valid
        assertFalse(login.checkPasswordComplexity("password"));  // No caps, number, special char
        assertFalse(login.checkPasswordComplexity("Passw0rd"));  // No special char
    }

    @Test
    public void testCheckCellPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+271234567890"));
        assertFalse(login.checkCellPhoneNumber("0123456789"));  // No +27
        assertFalse(login.checkCellPhoneNumber("+27123456"));   // Too short
    }

    @Test
    public void testRegisterUser() {
        String result = login.registerUser("user_", "Pass123!", "John", "Doe");
        assertEquals("Registration successful", result);

        result = login.registerUser("userlong", "Pass123!", "Jane", "Doe");
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.", result);

        result = login.registerUser("user_", "pass", "Jane", "Doe");
        assertEquals("Password is not correctly formatted, please ensure it contains at least 8 characters, a capital letter, a number and a special character.", result);
    }

    @Test
    public void testLoginUser() {
        login.registerUser("user_", "Pass123!", "Alice", "Smith");
        assertTrue(login.loginUser("user_", "Pass123!"));
        assertFalse(login.loginUser("user_", "WrongPass"));
    }

    @Test
    public void testReturnLoginStatus() {
        login.registerUser("user_", "Pass123!", "Alice", "Smith");
        String message = login.returnLoginStatus("user_", "Pass123!");
        assertEquals("Welcome Alice Smith, it is great to see you.", message);

        message = login.returnLoginStatus("user_", "WrongPass");
        assertEquals("Username or password incorrect, please try again.", message);
    }

    private void assertFalse(boolean checkUserName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void assertEquals(String welcome_Alice_Smith_it_is_great_to_see_yo, String message) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
