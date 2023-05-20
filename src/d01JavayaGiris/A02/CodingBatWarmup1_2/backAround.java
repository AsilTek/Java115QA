package d01JavayaGiris.A02.CodingBatWarmup1_2;

public class backAround {


    /*  Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
     */
    public static void main(String[] args) {

        System.out.println(backAround("cat"));
    }

    public static String backAround(String str) {

        char sonHarf = str.charAt(str.length()-1);
        String sonHali = sonHarf+str+sonHarf;

        return sonHali;

    }
}