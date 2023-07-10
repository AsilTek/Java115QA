package JavaSelfStudy.CodingBatWarmup1_2;

public class doubleX {

    public static void main(String[] args) {

        doubleX sh = new doubleX();
        System.out.println(sh.isThereTwoX("aaxxaa"));

    }

     boolean isThereTwoX(String str) {

         //System.out.println(str.startsWith("x")); //3

         if (str.charAt(str.indexOf("Grind50") + 1) == 'x')
             return true;

         return false;
     }
}