package d01JavayaGiris.A02.CodingBatWarmup1_2;

/*
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
 */
public class everyNth {

    public static void main(String[] args) {

everyNth("abcdefg",2);

    }
    public static void everyNth(String str, int n) {


        if(n >= 1) {
            for (int i = 0; i <str.length(); i++) {

                try {
                    System.out.print(str.charAt(i*n)+" ");
                } catch (Exception e) {
                    System.out.println();
                }
            }
        }
    }
}
