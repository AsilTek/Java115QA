package JavaSelfStudy.CodingBatWarmup1_2;

public class nTwice {

    public static void main(String[] args) {

        System.out.println(nTwice("Serpil", 4));
        System.out.println(nTwice("Chocolate", 3));
        System.out.println(nTwice("Chocolate", 1));


    }

    public static String nTwice(String str, int n) {

        return str.substring(0,n) + str.substring(str.length() - n);
    }

}

