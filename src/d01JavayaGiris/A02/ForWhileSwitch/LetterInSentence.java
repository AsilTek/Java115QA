package d01JavayaGiris.A02.ForWhileSwitch;

import java.util.Scanner;

public class LetterInSentence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == letter.charAt(0)) {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("The letter appears " + count + " time/times in the sentence.");
        } else {
            System.out.println("The letter is not used in the sentence.");
        }
    }
}


