package JavaSelfStudy.CodingBat.Array1;

public class unlucky1 {

    public static void main(String[] args) {

        int[] nums = {1, 3 ,1 ,4};
        System.out.println(trueUnlucky(nums));

    }
    public static boolean trueUnlucky(int[] nums) {

        boolean oneThree = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 && nums[i+1] == 3) {
                oneThree= true;
            }

        }
        return oneThree;
    }

}
