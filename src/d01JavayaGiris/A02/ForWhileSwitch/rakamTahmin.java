package d01JavayaGiris.A02.ForWhileSwitch;

import java.util.Scanner;

public class rakamTahmin {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 50) ;
        System.out.println("Guess the number between 1 and 50. You have 5 guesses.");
        int tried = 0;
        while (tried < 5) {
            System.out.print("Guess " + (tried+1) + ": ");
            int guess = scanner.nextInt();
            tried++;
            if (guess == targetNumber) {
                System.out.println("Congratulations!");
            } else if (guess < targetNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
            }
                System.out.println("Sorry, The target number was " + targetNumber + ".");
            }
        }
