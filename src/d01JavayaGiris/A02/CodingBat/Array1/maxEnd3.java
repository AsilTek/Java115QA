package d01JavayaGiris.A02.CodingBat.Array1;

import java.util.Arrays;

public class maxEnd3 {

    //newone i nasil cagiricagimi bulamadim.

    public static void main(String[] args) {

        int[] nums = {1, 4, 8};

    }

    public static int[] firstOrEnd(int[] nums) {

        int max = nums[0];
        int[]  newOne = new int[3];
        for (int i = 0; i <nums.length; i++) {
            if(nums[nums.length-1] > max) {
                newOne[i] = nums[nums.length-1];
            }
            else {
                newOne[i] = max;
            }
            //System.out.println(newOne);
        }
        return newOne;
    }

}
