package d01JavayaGiris.A02.CodingBat.Array1;
/*

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
public class firstHalf {

    public static void main(String[] args) {

        System.out.println(firstHalf("abcdef"));
    }
    public static String firstHalf(String str) {


        return str.substring(0,str.length() / 2);
    }

}
