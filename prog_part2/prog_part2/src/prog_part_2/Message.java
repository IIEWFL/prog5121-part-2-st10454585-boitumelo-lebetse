package prog_part_2;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

/*
 * GROK AI was used to help me fix complex bug/errors in my code,
 * and references were made to the following online resources:
 * - W3Schools Java Tutorial: https://www.w3schools.com/java
 * - freeCodeCamp - Java Unit Testing: https://www.freecodecamp.org/news/java-unit-testing/
 * - GeeksforGeeks Java Programming: https://www.geeksforgeeks.org/java/
 * - Oracle Java Documentation: https://docs.oracle.com/javase/tutorial/
 */


public class Message {
    private List<String> messagesSent = new ArrayList<>();
    private int totalMessages = 0;

    public boolean checkMessageID(String msgId) {
        return msgId.length() <= 10;
    }

    public boolean checkRecipientCell(String recipient) {
        return recipient.startsWith("+27") && recipient.length() <= 12 && recipient.substring(3).matches("\\d{9,10}");
    }

    public String createMessageHash(String msgId, String message) {
        String[] words = message.split("\\s+");
        String firstWord = words.length > 0 ? words[0].toUpperCase() : ""; // Uppercase first word
        String lastWord = words.length > 0 ? words[words.length - 1].toUpperCase() : ""; // Uppercase last word
        return msgId.substring(0, 2) + ":0:" + firstWord + lastWord;
    }

    public String sendMessage(String msgId, String recipient, String message, String msgHash, int action) {
        if (message.length() > 250) {
            return "Message exceeds 250 characters by " + (message.length() - 250) + ", please reduce size.";
        }
        totalMessages++;
        String messageDetails = "MessageID: " + msgId + ", Message Hash: " + msgHash + ", Recipient: " + recipient + ", Message: " + message;
        messagesSent.add(messageDetails);
        switch (action) {
            case 1:
                return "Message successfully sent.";
            case 2:
                return "OK to delete message.";
            case 3:
                return storeMessage(messageDetails);
            default:
                return "Invalid option.";
        }
    }

    public String storeMessage(String message) {
        // Simple storage in memory (JSON implementation would require a library like org.json)
        return "Message successfully stored.";
    }

    public String printMessages() {
        return String.join("\n", messagesSent);
    }

    public int returnTotalMessages() {
        return totalMessages;
    }
}