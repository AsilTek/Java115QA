package d01JavayaGiris.A02.Array;

import java.util.Arrays;

public class HowManyEvenNumberMDA {
//find how many even numbers are in MDA?
    public static void main(String[] args) {

        int[][] arr = {{1, 2, 3},{4, 5, 6},{7, 8}};
        System.out.println(arr[0][1]); //2
        System.out.println(Arrays.toString(arr[0]));  // [1, 2, 3]
        System.out.println(Arrays.deepToString(arr)); //[[1, 2, 3], [4, 5, 6], [7, 8]]

         evenNumbers(arr);

    }

    public static void evenNumbers (int[][] arr) {

        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {

                if(arr[i][j] %2==0) {
                    System.out.print(arr[i][j]+" ");
                    count++;
                }

            }

        }
        System.out.print("There are "+count+ " even numbers in MDA");

    }
}
