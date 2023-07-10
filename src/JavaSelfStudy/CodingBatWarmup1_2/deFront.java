package JavaSelfStudy.CodingBatWarmup1_2;

public class deFront {


    public static void main(String[] args) {

        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));

    }
    public static String deFront(String str) {

        if(str.startsWith("a")) {
            return "a"+ str.substring(2);
        }
        if(str.startsWith("b")){
            return "b"+str.substring(2);
        }

        return str.substring(2);
    }
}
