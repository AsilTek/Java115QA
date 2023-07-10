package JavaSelfStudy.Array;

import java.util.Scanner;

public class AmiralBattiOyunu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] board = new int[5][5]; //initialize board with all zeros
        int[] ship = { (int) (Math.random() * 5), (int) (Math.random() * 5) }; //randomly place the ship
        boolean gameOver = false;
        int tries = 0;

        while (!gameOver) {
            System.out.print("Guess row: ");
            int guessRow = sc.nextInt();
            System.out.print("Guess column: ");
            int guessCol = sc.nextInt();

            if (guessRow == ship[0] && guessCol == ship[1]) {
                System.out.println("Congratulations! You sank the battleship.");
                gameOver = true;
            } else {
                if ((guessRow < 0 || guessRow > 4) || (guessCol < 0 || guessCol > 4)) {
                    System.out.println("Oops, that's not even in the ocean.");
                } else if (board[guessRow][guessCol] == 1) {
                    System.out.println("You guessed that one already.");
                } else {
                    System.out.println("You missed.");
                    board[guessRow][guessCol] = 1;
                    tries++;
                }
                if (tries == 5) {
                    System.out.println("Game over. You ran out of tries.");
                    gameOver = true;
                }
            }
        }
        sc.close();
    }

    }


