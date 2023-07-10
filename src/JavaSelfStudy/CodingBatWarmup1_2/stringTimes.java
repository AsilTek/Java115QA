package JavaSelfStudy.CodingBatWarmup1_2;

public class stringTimes {

//    Given a string and a non-negative int n, return a larger string that is n copies of the original string.
//
//
//            stringTimes("Hi", 2) → "HiHi"
//    stringTimes("Hi", 3) → "HiHiHi"
//    stringTimes("Hi", 1) → "Hi"

    public static void main(String[] args) {


        stringAndTimes("Hi",3);
    }

    public static void stringAndTimes (String word, int n) {


        String result = "";
        for (int i=0; i<n; i++) {
            result = result + word;
        }

        System.out.println(result);
    }
}
