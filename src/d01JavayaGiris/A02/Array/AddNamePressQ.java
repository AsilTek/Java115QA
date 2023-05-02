package d01JavayaGiris.A02.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddNamePressQ {

    //get numbers from user and add them into array, when user enter 0 end the loop.

    public static void main(String[] args) {



        System.out.println(createList());

    }
    public static List<String> createList() {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String word = " ";

        while(!word.equalsIgnoreCase("q")) {
            System.out.println("Please enter names and press Q to exit");
            word = scanner.next();
            names.add(word);
        }
        return names;
    }

}
