package d01JavayaGiris.A02.CodingBatWarmup1_2;
/*
Given a string, return a version without the first and last char, so "Hello" yields "ell".
The string length will be at least 2.
withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */
public class withoutEnd2 {


    public static void main(String[] args) {

        System.out.println(withoutEnd("java"));

    }

    public static String withoutEnd(String str) {


           return   str.substring(1, str.length() - 1);

    }
}
