package JavaSelfStudy.ForWhileSwitch;

import java.util.Scanner;

public class factorial{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number less than 20: ");
        int n = scanner.nextInt();


        if (n >= 20) {
            System.out.println("Error: Number must be less than 20!");
           return;
        }

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The d01JavayaGiris.A02.ForWhileSwitch.factorial of " + n + " is: " + factorial);
    }



}