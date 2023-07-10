package JavaSelfStudy.CodingBatWarmup1_2;

public class lastTwo {

    public static void main(String[] args) {

        System.out.println(minCat("Hello", "Hilll"));

    }

    public static String minCat(String a, String b) {

        if(b.length() > a.length()) {

            return a+b.substring(b.length()-a.length());
        }
        if(a.length() > b.length()){

            return a.substring(a.length()-b.length())+b;
        }
        return a+b;
    }
}
