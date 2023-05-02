package d01JavayaGiris.A02.Array;

public class SmallestNumber {

    public static void main(String[] args) {

        int[] arr = {4, 16, 9, 1, 11, 26, 2};
        System.out.println(manualSortMethod(arr));
    }

    public static int manualSortMethod(int[] arr) {


        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
