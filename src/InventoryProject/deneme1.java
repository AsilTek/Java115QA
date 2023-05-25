package InventoryProject;

import java.nio.file.StandardOpenOption;
import java.util.*;

public class deneme1 {

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
        HashSet hm = new HashSet();
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

    }}

