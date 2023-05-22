package d01JavayaGiris.A02.LowLevelOrIFelse;

import java.util.Scanner;

public class tryCatch01 {

    public static void main(String[] args) {

        String str = "Java thought everything for us";
        int[] numbers = {2, 4, 6, 7, 9, 1, 3, 4, 2, 6, 3, 7, 4};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int userInput = 0;
        try {
            userInput = scanner.nextInt();
            System.out.println("the number you entered corresponded to Str of "+str.charAt(userInput)+
                    " and "+ numbers[userInput]);



        } catch (Exception e) {
            String x = scanner.next();
            System.out.println("Entered Wrong Number");
        }
//        for (int each : numbers) {
//            if(userInput == each) {
//                System.out.println("yes!! We have "+each+ " in given array");
//                break;
//            }
//        }




    }

}
