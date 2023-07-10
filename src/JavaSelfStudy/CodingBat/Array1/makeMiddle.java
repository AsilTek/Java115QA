package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class makeMiddle {


//    Given an array of ints of even length, return a new array length 2 containing the middle two elements
//    from the original array. The original array will be length 2 or more.
//    makeMiddle([1, 2, 3, 4]) → [2, 3]
//    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//    makeMiddle([1, 2]) → [1, 2]
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 7, 11, 16, 4, 12};

        System.out.println(Arrays.toString(takeMiddle(nums)));

    }

    public static int[] takeMiddle(int[] nums) {

        int[] result = new int[2];
        int mid = nums.length / 2;
        result[0] = nums[mid - 1];
        result[1] = nums[mid];
        return result;

    }

}
