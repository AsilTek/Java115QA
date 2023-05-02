package d01JavayaGiris.A02.ForWhileSwitch;

import java.util.Scanner;

public class makeItUpperCase {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String uppercaseStr = "";


        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c >= 'a' && c <= 'z') { // check if character is a lowercase letter
                c = (char) (c - 32); // convert to uppercase by subtracting 32 from the character code
            }

            uppercaseStr += c;
        }

        System.out.println(uppercaseStr);




    }
}
