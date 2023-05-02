package d01JavayaGiris.A02;

import java.util.Arrays;
import java.util.Scanner;

public class yapsilProgress {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Lutfen arrayin uzunlugunu belirtiniz: ");
        int len = scanner.nextInt();

        System.out.println("Lutfen uzunlugu " + len + " olan sayilari alt alta giriniz");
        int[] arr = new int[len];

        System.out.print("Lutfen Array 1'in her elemanini kac arttirmak istiyorsunuz? ");
        int artis = scanner.nextInt();

        array1olusturma(len,arr);
        arrayDegerArtirma(artis,arr);

        }

        public static int[] array1olusturma (int len, int[]arr) {


            for (int i = 0; i < len; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println("Ilk arrayimiz = " + Arrays.toString(arr));

            return arr;
        }
    public static int[] arrayDegerArtirma(int artis, int[]arr) {


        for (int i = 0; i < arr.length; i++) {
            arr[i] += artis;
        }
        System.out.print(" Array 1'in yeni hali: " + Arrays.toString(arr));

        return arr;
    }

    }

