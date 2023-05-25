package d01JavayaGiris.A02.CodingBatWarmup1_2;

public class twoChar {

    public static void main(String[] args) {

        System.out.println(twoChar("telefon", 3));

    }

    public static String twoChar(String str, int index) {


        if (index + 1 > str.length() - 1) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }
}
