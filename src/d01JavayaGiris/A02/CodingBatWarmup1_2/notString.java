package d01JavayaGiris.A02.CodingBatWarmup1_2;

/*

Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not", return the string unchanged.
Note: use .equals() to compare 2 strings.


notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */
public class notString {

    public static void main(String[] args) {

        System.out.println(notString("not bad"));
//2.yol : if(str.startsWith("not"))
//        return str;
//
//        return "not "+str;
    }
    public static String notString(String str) {

        if(!(str.length()>=3 && str.substring(0,3).equals("not"))) {
            return "not "+str;
        }
        return str;
    }
}
