package d01JavayaGiris.A02.CodingBatWarmup1_2;

public class close10 {
/*

Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
    public static void main(String[] args) {


        close10 c10 = new close10();
        System.out.println(c10.close10(13, 7));


    }

    public int close10(int a, int b) {

        if (Math.abs(10-a) < Math.abs(10-b)) {
            return a;
        }
        if (Math.abs(10-a) > Math.abs(10-b)) {
            return b;
        }
            return 0;
    }

}
