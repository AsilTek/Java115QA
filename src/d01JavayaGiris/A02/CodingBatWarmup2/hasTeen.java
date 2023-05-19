package d01JavayaGiris.A02.CodingBatWarmup2;
/*

We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true

varargs
 */// public boolean hasTeen(int... a) (int a, int b, int c)
//if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {

public class hasTeen {

    public static void main(String[] args) {

        hasTeen ht = new hasTeen();
        System.out.println(ht.hasTeen(20, 19, 10, 16, 24, 83));


    }

    public boolean hasTeen(int...a) {

        for (int i : a) {
            if((i >= 13 && i <= 19)) {
                return true;
            }
    }
        return false ;

    }
}
