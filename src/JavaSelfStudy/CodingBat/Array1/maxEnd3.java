package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class maxEnd3 {



    public static void main(String[] args) {

        int[] nums = {1, 4, 8};
        System.out.println(Arrays.toString(firstOrEnd(nums)));

    }

    public static int[] firstOrEnd(int[] nums) {

        int max = nums[0];
        int[]  newOne = new int[nums.length];
        for (int i = 0; i <nums.length; i++) {
            if(nums[nums.length-1] > max) {
                newOne[i] = nums[nums.length-1];
            }
            else {
                newOne[i] = max;
            }
        }
        return newOne;
    }


}
