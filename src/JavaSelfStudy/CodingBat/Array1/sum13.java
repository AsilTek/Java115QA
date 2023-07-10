package JavaSelfStudy.CodingBat.Array1;

public class sum13 {

    public static void main(String[] args) {

        int[] nums ={1, 2, 13, 1};

        System.out.println(sum13(nums));

    }
    public static int sum13(int[] nums) {

        int total = 0;

        boolean skipNext = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                skipNext = true;
                continue;
            }


            if (skipNext) {
                continue;
            }

            total += nums[i];
        }

        return total;
    }

}
