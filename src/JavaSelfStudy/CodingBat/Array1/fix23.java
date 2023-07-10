package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class fix23 {


//    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
//    Return the changed array.
//    fix23([1, 2, 3]) → [1, 2, 0]
//    fix23([2, 3, 5]) → [2, 0, 5]
//    fix23([1, 2, 1]) → [1, 2, 1]
        public static void main(String[] args) {

            int[] nums = {1, 2, 3};
            int[] result = fixIt(nums);

            System.out.println(Arrays.toString(result));


    }
    public static int[] fixIt(int[] nums) {


        int[] arr = new int[3];
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                arr[i] = nums[i];

            }

        }
            return nums;
    }

}
