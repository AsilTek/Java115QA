package JavaSelfStudy.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySoruCozumu {

    //verilen bir array e 1 deger eklemek
    public static void main(String[] args) {

        int[] arr = {4, 7, 12, 28, 16, 5};

        //10 ekle

        int[] uppdateDarr = new int[7];
        for (int i = 0; i < arr.length; i++) {
            uppdateDarr[i] = arr[i];
        }
        uppdateDarr[6] = 10;
        System.out.println(Arrays.toString(uppdateDarr));
        Arrays.sort(uppdateDarr);
        System.out.println(Arrays.toString(uppdateDarr));
        System.out.println(Arrays.binarySearch(uppdateDarr, 10));

//get number from user and add them into array when user pres 0 print array

//        Scanner scanner = new Scanner(System.in);
//        int num = 1;
//        String sequence = "";
//
//        while (num != 0) {
//            System.out.println("Enter a number (enter 0 to end sequence): ");
//            num = scanner.nextInt();
//            if (num == 0) {
//                break;
//            }
//            sequence += num + " ";
//        }
//        System.out.println("The sequence of numbers entered is: " + sequence);



    }
}








