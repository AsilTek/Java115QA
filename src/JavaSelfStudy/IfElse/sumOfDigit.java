package JavaSelfStudy.IfElse;

import java.util.Scanner;

public class sumOfDigit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Error: The number should be positive.");

        }

        int sum = 0;

        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}




