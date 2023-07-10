package JavaSelfStudy.IfElse;

import java.util.Arrays;

public class arrayKaydirma {

    public static void main(String[] args) {

        //{4,5,6,7}   {7,4,5,6)

        int[] arr= {4, 5, 6, 7};

        int[] newUpdate = kaydirmaArray(arr);
        System.out.println(Arrays.toString(newUpdate));
    }

    public static int[] kaydirmaArray ( int[] arr) {


 // bos bir array acarak degerleri onun icinde yazidiraz.

        int [] updatedArr = new int[4]; // 0, 0, 0, 0

        updatedArr[0] = arr[arr.length-1]; // upp  7 ,0 ,0 ,0

        for (int i = 0; i <arr.length-1; i++) {

            updatedArr[i+1] = arr[i];  // 7, 4, 5, 6


        }
        return updatedArr;
    }


}
