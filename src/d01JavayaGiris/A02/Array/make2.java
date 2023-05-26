package d01JavayaGiris.A02.Array;

import java.util.Arrays;

public class make2 {

    public static void main(String[] args) {


        int[] a = {};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.toString(make2(a,b)));
    }
    public static int[] make2(int[] a, int[] b) {

        int[] arr = new int[2];


                if(a.length==0){
                    arr[0] = b[0];
                    arr[1] = b[1];

                }
                if(a.length==1){
                    arr[0] = a[0];
                    arr[1] = b[0];
                }
                if(a.length==2){
                    arr[0] = a[0];
                    arr[1] = a[1];
                }
                return arr;
    }
}
