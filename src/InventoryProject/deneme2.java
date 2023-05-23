package InventoryProject;

import java.util.HashMap;
import java.util.Map;

public class deneme2 {

    public static void main(String[] args) {

        /*
        Question: Print the names and surnames of the students in the H branch as a list.
         */

        Map<Integer,String> schoolMap = new HashMap<>();

        schoolMap.put(101,"Ali-Cem-10-H");//  [Ali, Cem, 10, H]
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");

        schoolMap.values().spliterator();

    }
}
