package JavaSelfStudy.CodingBatWarmup1_2;

public class startOz {

    public static void main(String[] args) {

        System.out.println(startOz("bzoo"));
    }

    public static String startOz(String str) {

        String toplam = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            toplam = toplam + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            toplam = toplam + str.charAt(1);
        }

        return toplam;
    }
}
