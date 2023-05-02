package d01JavayaGiris.A02.Array;

import java.util.Arrays;
import java.util.Scanner;

//Create a method that takes the size and elements of the array from the user and creates
//        the array and returns it to us.
public class UserLengthAndElements {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Arrayin boyutunu giriniz: ");
        int size =scan.nextInt();
        System.out.println("Arrayin elemanlarini  giriniz: ");

        lengthElements(size);
    }
    public static void lengthElements(int size) {

        int arr[] = new int[size];
        Scanner scan = new Scanner(System.in);


        for (int i = 0; i < size; i++) {

            int val = scan.nextInt();
            arr[i] = val;

        }

        System.out.println(Arrays.toString(arr));
    }
}
