package d01JavayaGiris.A02.CodingBat.Array1;

public class sameFirstLast {
    public static void main(String[] args) {

        int[] nums = {1, 5, 14, 9, 2};

        System.out.println(firstLastEqual(nums));
    }
    public static boolean firstLastEqual(int[] nums) {

        boolean isItEqual = false;
        for (int i = 0; i <nums.length; i++) {
            if(nums[0] == nums[nums.length-1]) {
                isItEqual = true;
            }

        }
            return isItEqual;
    }
}
