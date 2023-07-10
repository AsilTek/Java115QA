package JavaSelfStudy.Array;

public class CheckDesiredElementinArray {

    public static void main(String[] args) {

        findElement(3);

    }
    public static void findElement ( int desiredElement) {


        int[] arr = {1, 3, 5, 66, 3, 9};
        int flag = 0;

        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == desiredElement) {
                flag++;
            }

        }
        System.out.println("Desired number: "+ desiredElement+" is in the array "+ flag+" times.");
    }

}
