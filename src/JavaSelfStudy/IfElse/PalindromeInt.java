package JavaSelfStudy.IfElse;

import java.util.Scanner;

public class PalindromeInt {

    public static void main(String args[]){

        System.out.println(isPalindrome1(121));
        System.out.println(isPalindrome2(121));
        System.out.println(isPalindrome3(121));
    }
    public static boolean isPalindrome1(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }

    public static boolean isPalindrome2(int integer) {
        String intStr = Integer.toString(integer);

        StringBuilder x = new StringBuilder(intStr);

        if(x.reverse().toString().equals(intStr)){
            return true;
        }
        return false;
    }

    public static boolean isPalindrome3(int integer) {
        int palindrome = integer;
        int reverse = 0;

        // Compute the reverse
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // The integer is palindrome if integer and reverse are equal
        return integer == reverse; // Improved by Peter Lawrey

    }
}
