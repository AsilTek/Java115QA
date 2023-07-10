package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class midThree {

    public static void main(String[] args) {


        int[] nums = {2, 6, 11, 17, 4, 9, 21};

        System.out.println(Arrays.toString(midThree(nums)));


    }

    public static int[] midThree(int[] nums) {

        int[] result = new int[3];
        int mid  = nums.length /2;
        result[0] = nums[mid-1];
        result[1] = nums[mid];
        result[2] = nums[mid+1];

        return result;
    }
}
