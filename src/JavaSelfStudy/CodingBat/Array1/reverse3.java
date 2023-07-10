package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class reverse3 {


//    Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
//    reverse3([1, 2, 3]) → [3, 2, 1]
//    reverse3([5, 11, 9]) → [9, 11, 5]
//    reverse3([7, 0, 0]) → [0, 0, 7]
    public static void main(String[] args) {

        int[] number = {1,2,3} ;
        int[] a = reverseInt(number);
        System.out.println(Arrays.toString(a) );

    }

    public static int[] reverseInt(int[] number) {

        int[] arr = new int[number.length];

        for (int i = number.length-1; i >= 0; i--) {
            arr[arr.length-1-i] += number[i];
        }

       return arr;
    }
}
