import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class OyunDeneme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Timer timer = new Timer();

        String[] questions = {
                "What is your name?",
                "What is your favorite color?",
                "What is your favorite food?"
        };

        int timeLimitInSeconds = 10; // Set a time limit of 10 seconds for each question

        for (String question : questions) {
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Time's up! You didn't provide a response.");
                    System.exit(0);
                }
            }, timeLimitInSeconds * 1000); // Convert seconds to milliseconds

            System.out.println(question + " You have " + timeLimitInSeconds + " seconds to answer:");

            String response = scanner.nextLine(); // Read user input

            timer.cancel(); // Cancel the timer since user input was received

            System.out.println("You entered: " + response);
        }

        System.out.println("Thank you for your responses!");
    }
}