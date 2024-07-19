/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package networkProgramming.lab1;

/**
 *
 * @author devil
 */
import java.util.regex.*;

public class SpamCheck {
    public static void main(String[] args) {
        String emailContent = "Congratulations! You've won a lottery! Click here to claim your prize.";
        String spamPattern = "(win|won|prize|click here|free)";

        Pattern pattern = Pattern.compile(spamPattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(emailContent);
        if (matcher.find()) {
            System.out.println("Spam detected in the email.");
        } else {
            System.out.println("No spam detected in the email.");
        }
    }
}
