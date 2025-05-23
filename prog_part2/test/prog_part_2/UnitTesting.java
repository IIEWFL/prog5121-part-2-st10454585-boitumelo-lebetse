package prog_part_2;

import prog_part_2.Message;
import org.junit.Test;
import static org.junit.Assert.*;

/*
 * GROK AI was used to help me fix complex bug/errors in my code,
 * and references were made to the following online resources:
 * - W3Schools Java Tutorial: https://www.w3schools.com/java
 * - freeCodeCamp - Java Unit Testing: https://www.freecodecamp.org/news/java-unit-testing/
 * - GeeksforGeeks Java Programming: https://www.geeksforgeeks.org/java/
 * - Oracle Java Documentation: https://docs.oracle.com/javase/tutorial/
 */


public class UnitTesting {
    Message message = new Message();

    @Test
    public void testAssertEquals() {
        String shortMsg = "Hi Mike";
        String longMsg = "a".repeat(251);
        assertEquals("Message successfully sent.", message.sendMessage("1234567890", "+27718693002", shortMsg, message.createMessageHash("1234567890", shortMsg), 1));
        assertEquals("Message exceeds 250 characters by 1, please reduce size.", message.sendMessage("1234567890", "+27718693002", longMsg, message.createMessageHash("1234567890", longMsg), 1));
    }

    @Test
    public void testRecipientNumberFormat() {
        assertEquals("Message successfully sent.", message.sendMessage("1234567890", "+27718693002", "Hi Mike", message.createMessageHash("1234567890", "Hi Mike"), 1));
        assertEquals("Message successfully sent.", message.sendMessage("1234567890", "+27123456789", "Hi Mike", message.createMessageHash("1234567890", "Hi Mike"), 1));
        assertFalse(message.checkRecipientCell("+27123456")); // Too short
        assertFalse(message.checkRecipientCell("27718693002")); // Missing +
    }

    @Test
    public void testMessageHash() {
        String msg = "Hi Mike can you join us";
        String msgHash = message.createMessageHash("1234567890", msg);
        assertEquals("12:0:HIUS", msgHash);
    }

    @Test
    public void testMessageIDCreated() {
        String msgId = "1234567890";
        assertTrue(message.checkMessageID(msgId));
        assertEquals("Message ID generated: 1234567890", "Message ID generated: " + msgId);
        assertEquals("Message successfully sent.", message.sendMessage(msgId, "+27718693002", "Hi Mike", message.createMessageHash(msgId, "Hi Mike"), 1));
        assertEquals("OK to delete message.", message.sendMessage(msgId, "+27718693002", "Hi Mike", message.createMessageHash(msgId, "Hi Mike"), 2));
        assertEquals("Message successfully stored.", message.sendMessage(msgId, "+27718693002", "Hi Mike", message.createMessageHash(msgId, "Hi Mike"), 3));
    }
}