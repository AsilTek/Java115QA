package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class makeLast {

    public static void main(String[] args) {

        int[] nums = {3};

        System.out.println(Arrays.toString(makeLast(nums)));

    }
    public static int[] makeLast(int[] nums) {

        int[] arr = new int[nums.length*2];
        arr[arr.length-1] = nums[nums.length-1];

        return arr;
    }

}
