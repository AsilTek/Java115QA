package JavaSelfStudy.CodingBatWarmup1_2;
/*

Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
public class frontBack {

    public static void main(String[] args) {

        System.out.println(frontBack("serpil"));
    }

    public static String frontBack(String str) {

        if(str.length() == 1){
            return str;
        }

        char ilkHarf = str.charAt(0); //c
        char sonHarf = str.charAt(str.length()-1); //e
        String ortasi = str.substring(1,str.length()-1); //ode
        String sonHali = sonHarf+ortasi+ilkHarf;

        return sonHali;
    }
}
