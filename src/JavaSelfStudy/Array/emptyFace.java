package JavaSelfStudy.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class emptyFace {

    public static void main(String[] args) {

        int[] arr = {4,5,6,7};  //{7,4,5,6)

        int[] x = Shifting(arr);
        System.out.println(Arrays.toString(x));

    }

    public static int[] Shifting(int[] arr) {


        int last = arr[arr.length - 1];

        for (int i = arr.length-1; i >0 ; i--) {
            arr[i] = arr[i-1];
        }

        arr[0] = last;

        return arr;
    }
}
