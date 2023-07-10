package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class MDASumSameIndex {

    //Question 2- calculate sum of  the elements with the same index in a given 2 dimensional array and
// assign these sums to a single-layered array that we will create.


//       input : int[][] arr = {{3,4,5}, {2,3,6,7}};
//       output: [5, 7, 11]

    public static void main(String[] args) {

        int[][] myArray = {{3,4,5}, {6,3,6,7}};

        int smallest = myArray[0].length; //4


        for (int i = 0; i <myArray.length; i++) {
            if(myArray[i].length  <  smallest){
                smallest = myArray[i].length;
            }
        }

        int[] result = new int[smallest]; // int[] resultArray= int[3]

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length-i; j++) {
                result[j] += myArray[i][j];
           }
       }
        System.out.println(Arrays.toString(result));


    }

}


