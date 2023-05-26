package InventoryProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deneme123 {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int num1 = scanner.nextInt();
        System.out.println(method1(num1));
    }


    static List<Integer> method1(int num1) {
        List<Integer> list1 = new ArrayList<>();

        num1 = 1;

        while (!(num1 == 0)) {
            System.out.println("Please enter numbers. Press 0 to end");
            num1 = scanner.nextInt();

            if(num1 > 0){
                list1.add(num1);

            }else {
                break;
            }
        }
            return list1;

        }
    }





