package JavaSelfStudy.Array;

import java.util.Arrays;
import java.util.Scanner;

public class BiriUserdanIkiArrayToplama {
    public static void main(String[] args) {


        //Q1 Array Degerlerini Verilen Sayi Oraninda Artirin.

        Scanner scan= new Scanner(System.in);

        System.out.print("Array degerlerini artirmak icin bir sayi giriniz: ");

        int num=scan.nextInt();

        int [] arr = {2,3,4,5};

        int	[] arr4= arrayDegerArtirma(arr, num);

        System.out.println("Sonraki Array: "+Arrays.toString(arr4));

        int [] arr2 = new int[4];

        int[] arr3 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = (arr[i] + arr4[i])-num;
        }
        System.out.println("En Son Toplam: "+Arrays.toString(arr2));

    }
    public static int [] arrayDegerArtirma(int[] arr1, int num1) {

        System.out.println("Onceki Array: "+ Arrays.toString(arr1));

        for(int i=0; i<arr1.length; i++) {

            arr1[i] = arr1[i]+ num1;

        }
        return arr1;



    }

}


