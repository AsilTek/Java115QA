package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class plusTwo {

    public static void main(String[] args) {

        int[] a = {1,2};
        int[] b = {3,4};

        System.out.println(Arrays.toString(plusTwo(a,b)));


    }
    public static int[] plusTwo(int[] a, int[] b) {

        int[] arr = new int[a.length+b.length];

        arr[0] = a[0];
        arr[1] = a[1];
        arr[2] = b[0];
        arr[3] = b[1];

        return arr;


    }

}
