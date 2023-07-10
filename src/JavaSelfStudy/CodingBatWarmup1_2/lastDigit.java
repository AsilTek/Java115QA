package JavaSelfStudy.CodingBatWarmup1_2;
/*

Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true
 */
public class lastDigit {

    public static void main(String[] args) {

        System.out.println(lastDigit(20, 235));


    }

    public static boolean lastDigit(int a, int b) {

        if(a % 10 == b % 10) {
            return true;
        }
        return false;
    }
}

//2. yol
//        String str = Integer.toString(a);
//        String str2 = Integer.toString(b);
//        if(str.charAt(str.length()-1) == str2.charAt(str.length()-1)) {
//            return true;
//        }
//
//        return false;