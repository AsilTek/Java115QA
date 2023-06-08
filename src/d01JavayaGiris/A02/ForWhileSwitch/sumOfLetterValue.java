package d01JavayaGiris.A02.ForWhileSwitch;

/*
Assign numbers starting with 1 for each letter of the alphabet.
Write the program that gives the total number for the entered word.
 */
public class sumOfLetterValue {
    public static void main(String[] args) {
        String word = "Abc";
        int sum = totalValueOfWord(word);
        System.out.println("Total value of given word: " + sum);
    }

    public static int letterValue(char letter) {
        // Küçük harfler için ASCII değerlerine göre sayıyı hesaplar
        if (letter >= 'a' && letter <= 'z') {
            return letter - 'a' + 1;
        }
        // Büyük harfler için ASCII değerlerine göre sayıyı hesaplar
        else if (letter >= 'A' && letter <= 'Z') {
            return letter - 'A' + 1;
        }
        // Harf değilse veya geçersiz ise 0 döner
        else {
            return 0;
        }
    }
    public static int totalValueOfWord(String word) {
        int total = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            int value = letterValue(letter);
            total += value;
        }

        return total;
    }
}
