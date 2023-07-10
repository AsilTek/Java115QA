package JavaSelfStudy.CodingBat.Array1;

import java.util.Arrays;

public class sum3 {

    public static void main(String[] args) {

        int[]nums = {4, 5 ,6};

        System.out.println(sumAll(nums));


    }
    public static int sumAll(int[] nums) {

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += nums[i];

        }
        System.out.println("the sum of "+Arrays.toString(nums)+" is "+ sum);

        return sum;
    }
}
