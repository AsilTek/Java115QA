package JavaSelfStudy.CodingBatWarmup1_2;

import java.util.Random;
import java.util.Scanner;

public class diceGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of rounds: ");
        int rounds = scanner.nextInt();

        int computerWins = 0;
        int userWins = 0;

        for (int i = 1; i <= rounds; i++) {
            int computerRoll = random.nextInt(6) + 1;
            int userRoll = random.nextInt(6) + 1;

            System.out.println("Round " + i + ":");
            System.out.println("Computer rolled: " + computerRoll);
            System.out.println("User rolled: " + userRoll);

            if (computerRoll > userRoll) {
                computerWins++;
                System.out.println("Computer wins this round!");
            } else if (userRoll > computerRoll) {
                userWins++;
                System.out.println("User wins this round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println();
        }

        System.out.println("Final Results:");
        System.out.println("Computer wins: " + computerWins);
        System.out.println("User wins: " + userWins);

        if (computerWins > userWins) {
            System.out.println("Computer wins the game!");
        } else if (userWins > computerWins) {
            System.out.println("User wins the game!");
        } else {
            System.out.println("It's a tie game!");
        }
    }

}
