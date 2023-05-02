package d01JavayaGiris.A02.CodingBat.Array1;

public class no23 {


//    Given an int array length 2, return true if it does not contain a 2 or 3.
//
//
//    no23([4, 5]) → true
//    no23([4, 2]) → false
//    no23([3, 5]) → false
        public static void main(String[] args) {

            int[] nums = {1, 5, 3};
            System.out.println(twoAndThree(nums));

    }
    public static boolean twoAndThree(int[] nums) {

            boolean areThere = false;

        for (int i = 0; i <nums.length; i++) {
            if (nums[0] == 2 || nums[0] == 3)
                areThere = true;
            else if (nums[1] == 2 || nums[1] == 3)
                areThere = true;
            else if(nums[2]==2 || nums[2]==3)
                areThere =true;

        }
        return areThere;
    }
}
