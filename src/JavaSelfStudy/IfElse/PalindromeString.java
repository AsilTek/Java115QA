package JavaSelfStudy.IfElse;

public class PalindromeString {

    public static void main(String[] args)
    {

        String str = "geeks";

        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
    public static boolean isPalindrome(String str)
    {

        String rev = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            return true;
        }
        return false;
    }

}
