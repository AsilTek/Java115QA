package d01JavayaGiris.A02.Array;

import java.util.Arrays;

public class KaydirmaArray {
    public static void main(String[] args) {
      //{4, 5, 6, 7}      {7, 4, 5, 6}
      int[] arr =  {4, 5, 6, 7};

       int[]updatedArr = arrayKaydirma(arr);
        System.out.println(Arrays.toString(updatedArr));


    }

    public static int[] arrayKaydirma(int[]arr) {

//1. yol : bos bir array acmak
        int [] updatedArr = new int[4]; // 0, 0, 0, 0

        updatedArr[0] = arr[arr.length-1]; //7, 0, 0, 0

        for (int i = 0; i < arr.length-1; i++) {

            updatedArr[i+1] = arr[i]  ;  //7, 4, 5, 6

        }
    return updatedArr;


    }
}
