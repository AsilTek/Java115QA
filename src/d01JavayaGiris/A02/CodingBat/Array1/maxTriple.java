package d01JavayaGiris.A02.CodingBat.Array1;

public class maxTriple {

    public static void main(String[] args) {

        int[]nums= {1, 6, 9, 11};
        System.out.println(maxTriple(nums));

    }

    public static int maxTriple(int[] nums) {

        int max = nums[0];
        int[] newOne = new int[nums.length];

        if(nums.length % 2 == 0) {
            System.out.println("Please enter odd length of array");
            System.exit(1);

        }

        if (nums.length % 2 != 0) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > max) {
                    max = nums[i];
                }
            }
        }


            return max;
    }
}
