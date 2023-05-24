package InventoryProject;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        Map<Integer,String> schoolMap = new HashMap<>();

        schoolMap.put(101,"Ali-Cem-10-H");//  [Ali, Cem, 10, H]
        schoolMap.put(102,"Veli-Can-10-M");
        schoolMap.put(103,"Ali-Can-11-M");
        schoolMap.put(104,"Ayse-Cem-11-H");
        schoolMap.put(105,"Ayse-Han-10-H");
        schoolMap.put(106,"Veli-Han-10-H");


        //schoolMap.replace(102, schoolMap.get(102).replace("Can", "Brown"));
        //System.out.println(schoolMap.get(102));

        String str = schoolMap.get(102);
        String str2 = str.replace("Can", "Brown");
        System.out.println(str2);

//        for (String each : schoolMap.values()) {
//            String[] arr = each.split("-");
//            if(arr[arr.length-1].equals("M")){
//                arr[arr.length-1] = "N";
//            }
//            System.out.println(Arrays.toString(arr));
            //System.out.println(schoolMap);

//        Queue<String> letters = new ArrayList<String>();
//
//        letters.offer("A");
//        letters.add("B");
//        System.out.println(letters);


    }

    }













