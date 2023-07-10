package JavaSelfStudy.CodingBatWarmup1_2;
/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
public class mixStart {

    public static void main(String[] args) {

        mixStart ms = new mixStart();
        System.out.println(ms.mixStart("mix snacks"));


    }
    public boolean mixStart(String str) {

        if(str.substring(1,3).equals("ix")) {
            return true;
        }
        return false;
    }
}
