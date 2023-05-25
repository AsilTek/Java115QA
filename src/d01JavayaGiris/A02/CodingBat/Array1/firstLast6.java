package d01JavayaGiris.A02.CodingBat.Array1;

public class firstLast6 {

//    Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//
//
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false

    public static void main(String[] args) {

        int[] arr = {13, 1, 2, 3};
        System.out.println(checkFirstAndLast(arr));
    }

    public static boolean checkFirstAndLast(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (!(arr[0] == 6 || arr[arr.length - 1] == 6)) {
                return false;
            }

        }
        return true;
    }
}
