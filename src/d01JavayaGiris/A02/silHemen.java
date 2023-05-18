package d01JavayaGiris.A02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class silHemen {

    public static void main(String[] args) {

        silHemen sh = new silHemen();
        System.out.println(sh.isThereTwoX("aaxxaa"));

    }

     boolean isThereTwoX(String str) {

         //System.out.println(str.startsWith("x")); //3

         if (str.charAt(str.indexOf("x") + 1) == 'x')
             return true;

         return false;
     }
}