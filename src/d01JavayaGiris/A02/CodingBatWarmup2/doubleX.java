package d01JavayaGiris.A02.CodingBatWarmup2;

public class doubleX {

    public static void main(String[] args) {

        doubleX sh = new doubleX();
        System.out.println(sh.isThereTwoX("aaxxaa"));

    }

     boolean isThereTwoX(String str) {

         //System.out.println(str.startsWith("x")); //3

         if (str.charAt(str.indexOf("x") + 1) == 'x')
             return true;

         return false;
     }
}