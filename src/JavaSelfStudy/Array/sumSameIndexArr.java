package JavaSelfStudy.Array;

import java.util.*;
//        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
//        output: [5, 7, 11]
public class sumSameIndexArr {

    public static void main(String[] args) {

        int[][] arr = {{3,4,5}, {2,3,6}, {}};

        sumSameIndex(arr);

    }

    public static void sumSameIndex (int arr[][]) {

        int[] sumArray = new int[3];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                sumArray[j] +=arr[i][j];
            }
        }

        System.out.println(Arrays.toString(sumArray));


    }
}