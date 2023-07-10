package JavaSelfStudy.LeetCodePractice;

public class Study02 {

    public static void main(String[] args) {

        System.out.println(isPalindrom("madam"));

    }
    public static boolean isPalindrom(String str){

        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

}
