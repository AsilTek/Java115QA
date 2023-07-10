package JavaSelfStudy.IfElse;

import java.util.Scanner;

public class teaSugar {

    public static void main(String[] args) {

        System.out.println("How many glass of tea do you drink in a day? ");
        Scanner scanner = new Scanner(System.in);
        int glass = scanner.nextInt();
        System.out.println("How many sugar do you use for a glass of tea? ");
        double sugar = scanner.nextInt() * 2.7;
        double count = (glass * sugar * 365) / 1000; //1 yillik seker tuketimi kg olarak
        if (sugar > 0)
        System.out.println("You drink "+ glass + " glasses of tea per day,\nYou use "+ count + " kg of sugar per year,\nin 40 years, you will have used " + count*40 +  " kg of sugar." );
            else
        System.out.println("“Good Job, less sugar more health”");






    }
}







