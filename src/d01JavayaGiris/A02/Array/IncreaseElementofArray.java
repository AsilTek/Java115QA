package d01JavayaGiris.A02.Array;

import java.util.Arrays;

public class IncreaseElementofArray {

    //create a method that increase all its elements of int array by given number.




    public static void main(String[] args) {

        int[] sonuc = increaseElement(3);
        System.out.println(Arrays.toString(sonuc));

    }
    //create a method
    public static int[] increaseElement (int increase) {

        //create an int array
        int[] arr = {1, 5, 8, 12, 15};

        //create an empty array that match with main array' length.
        int[] updatedArray = new int[arr.length];
        //create for loop for arr and increase each element into uppdatedArr
        for (int i = 0; i <arr.length; i++) {
            updatedArray[i] = arr[i]+ increase;
        // or we can increase elements and put them into in the same array without creating new array
        // for (int i = 0; i <arr.length; i++) {
        //            arr[i] = arr[i]+ increase;
        }
        return updatedArray;

    }
}
