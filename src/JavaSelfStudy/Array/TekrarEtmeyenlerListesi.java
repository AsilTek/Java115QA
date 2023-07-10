package JavaSelfStudy.Array;

import java.util.ArrayList;
import java.util.List;

public class TekrarEtmeyenlerListesi {

    public static void main(String[] args) {

        int[] repeatedInt = {3, 6, 11, 9, 3, 5, 8, 6, 5, 12, 11};

        System.out.println(notRepeated(repeatedInt));

    }

    public static List<Integer> notRepeated (int[] repeatedInt) {

        List<Integer> emptyOne = new ArrayList<>();
        for (int i = 0; i <repeatedInt.length; i++) {
            if(!(emptyOne.contains(repeatedInt[i]))) {
                emptyOne.add(repeatedInt[i]);
            }

        }
        return emptyOne;
    }
}
