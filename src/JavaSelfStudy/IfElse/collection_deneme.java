package JavaSelfStudy.IfElse;

import java.util.*;

public class collection_deneme {

    public static void main(String[] args) {

        List liste = new ArrayList<>();
        liste.add("Asil");
        liste.add('c');
        liste.add(21);

        liste.forEach(each -> System.out.print(each + "_")); //Asil_c_21_

        System.out.println();

        for (int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i) + "=");  //Asil=c=21=
        }
        System.out.println();

        for (Object each : liste) {
            System.out.print(each + "--");  //Asil--c--21--
        }

        System.out.println();

        Iterator itr = liste.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + "-"); //Asil-c-21-
        }
        System.out.println();
        Set hm = new HashSet();
        hm.add("Asil");
        hm.add('c');
        hm.add(21);

        hm.forEach(each -> System.out.print(each + "*")); //c*21*Asil*

        System.out.println();

        String[] arr = new String[5];
        arr[0] = "Ali";
        arr[1] = "Veli";
        arr[2] = "Can";
        arr[3] = "Mehmet";

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        System.out.println(Arrays.toString(arr));













        int[] array = {1,2,3,6,3,8,9,4,5,3,2,4};

        Set<Integer> newArray = new HashSet<>();
        for (int each : array ) {
            newArray.add(each);
        }
        System.out.println(newArray);
        System.out.println(Arrays.toString(array));
        System.out.println(array[2]);



    }}

