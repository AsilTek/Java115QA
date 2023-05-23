package d01JavayaGiris.A02.CodingBatWarmup1_2;
/*

Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

 */
public class lastChars {

    public static void main(String[] args) {


        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }

    public static String lastChars(String a, String b) {

        if((a.length() == 0  || b.length() == 0 )) {
            return  a.charAt(0) + "@";
        }


        //return a.substring(0,1)+b.substring(b.length()-1);

        return ""+a.charAt(0)+b.charAt(b.length()-1);

    }

}
