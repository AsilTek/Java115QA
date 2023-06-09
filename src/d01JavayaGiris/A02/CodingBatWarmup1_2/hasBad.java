package d01JavayaGiris.A02.CodingBatWarmup1_2;
/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
public class hasBad {

    public static void main(String[] args) {

        System.out.println(hasBad("abc"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));


    }

    public static boolean hasBad(String str) {

        if(str.length() < 4)
            return false;

        if (str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
