package JavaSelfStudy.Array;

import java.util.Arrays;
import java.util.Random;

public class KendiCalisma1 {

    public static void main(String[] args) {

// initialize an array 1.data type 2. length . You can not assign elements into it.
        int[] arr = new int[5];
// initialize an array with assigning its elements.
        String[] arr2 = {"Asil", "Arda", "Yagiz"};
//we also can initialize with its elements at a time
        int[] arr3 = new int[]{1, 2, 3, 4, 5};
//to see arr2 length or to display how many elements does arr2 have?
        System.out.println(arr2.length);
// how to print
        System.out.println(Arrays.toString(arr2));
//printing all elements of arr2
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println(); //to next line

//Enhanced for-loop to see arr2 elements
        for (String element : arr2) {
            System.out.print(element + " ");
        }
        System.out.println(); //to next line

        Object objectVariable = arr3;
        if (objectVariable instanceof int[]) {

            System.out.println();
        }


        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World ");
        objectArray[2] = Arrays.toString(arr2);
        System.out.println(Arrays.toString(objectArray));


//examples of anonymous array
        System.out.println(new int[]{11, 12, 13, 14, 15}.length); //5
        System.out.println(new int[]{31, 94, 75, 64, 41}[1]); //94

//Usage of copyOf method.
        int[] deneme1 = new int[10];
        deneme1 = getRandomArray(10);
        System.out.println("deneme1" +Arrays.toString(deneme1));
        int[] deneme2 = Arrays.copyOf(deneme1,4);
        System.out.println(Arrays.toString(deneme2));

//Here is within main method to call getRandomArray
        int[]firstArray = getRandomArray(5);
        System.out.println(Arrays.toString(firstArray));

//Here is sorting result in alphabetic order
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));




    }
 // Creating 10 random numbers for newInt array using Random method.
        private static int[] getRandomArray(int number){
            Random random = new Random();
            int[] newInt = new int[number];
            for (int i = 0; i < 10; i++) {
                newInt[i] = random.nextInt(100);
            }
            return newInt;
        }

}
