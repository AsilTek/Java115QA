package d01JavayaGiris.A02.Array;

import java.util.Arrays;

public class
ShortestAndLongestString {

    public static void main(String[] args) {

        String [] str = {"Asil", "Mehmet", "Ibrahim", "Ali"};
        LongestShortest(str);
    }

    public static void LongestShortest(String[] str) {

        String shortest = str[0];
        String longest = str[0];

        for (int i = 0; i <str.length; i++) {
            if(shortest.length() > str[i].length()) {
                shortest = str[i];
            }
            if(longest.length() < str[i].length()) {
                longest = str[i];
            }

        }
            System.out.println("Shortest one is: "+shortest+"\nand longest one is: "+longest);
    }
}
