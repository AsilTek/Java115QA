package d01JavayaGiris.A02.ForWhileSwitch;

import java.util.Scanner;

public class reverse {

    public static void main(String[] args) {
        System.out.println("Please enter a word/words");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String reverse = "";
        for(int i = str.length()-1; i>=0; i--)
        {
            reverse = reverse + str.charAt(i);

        }
        System.out.println(reverse);
    }
}
