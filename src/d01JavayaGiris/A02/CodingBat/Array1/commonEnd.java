package d01JavayaGiris.A02.CodingBat.Array1;

public class commonEnd {


//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
//
//
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true

    public static void main(String[] args) {

        int[] arr = {1,3,4,6,11};     int[] arr2 = {3,5,6,9,11};

        System.out.println(SameFirstEnd(arr,arr2));

    }

    public static boolean SameFirstEnd (int[] arr , int[] arr2) {

        boolean isSame = false;
        if(arr[0] == arr2[0] || arr[arr.length-1] == arr2[arr2.length-1]) {
        isSame = true;
        }

        return isSame;
    }
}