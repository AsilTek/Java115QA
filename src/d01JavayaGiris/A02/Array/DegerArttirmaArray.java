package d01JavayaGiris.A02.Array;

import java.util.Arrays;

public class DegerArttirmaArray {

    public static void main(String[] args) {
    int[] arr = {1,3,5,7,9,12};
    int artis = 2;
        arr = DegerArttir(arr,artis);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] DegerArttir(int[] arr, int artis) {

        for (int i = 0; i <arr.length; i++) {
            arr[i] = arr[i]+artis;
        }
        return arr;


            }

}
