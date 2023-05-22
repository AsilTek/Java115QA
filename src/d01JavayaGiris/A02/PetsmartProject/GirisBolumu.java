package d01JavayaGiris.A02.PetsmartProject;

import java.util.Scanner;

public class GirisBolumu {

    public static void main(String[] args) {




        readyTest();
    }

    public static void greetingQuiz (){

        System.out.println("               WELCOME ONBOARD!!\n");

        System.out.println (".*. PETSMART & WISEQUARTER PARTNERSHIP PRESENTS .*.\n ");
        System.out.println();
        System.out.println("ANSWER 5 CORE JAVA QUESTIONS and GET THE BIG PRIZE!! ");

        System.out.println("LETS TAKE A LOOK THROUGH THE RULES\n"+
                " 1.to participate in the draw, you must first create a membership. In this way, you will have the chance to take advantage of other opportunities.\n "+
                "2.You will have 5 time limited questions. You should answer each of them in 10 seconds!\n" +
                " 3.For every correct answer you make, you will get 1 guess right.\n" +
                " 4.At the end of the quiz, you will have guess rights as sum of your correct answers ex. 3 correct answers out of 5 means 3 guess rights\n"+
                " 5.In the draw, you will guess number between 1-20 and should match with the chosen number by computer to be rewarded.\n"+
                " 6.Reward will be massive amount of food for your pet\n");
        System.out.println("Lets start with membership process.Please stick with following steps... ");

    }

    public static void readyTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready to take the Quiz????");
        System.out.println("A. Yes lets go!!     B. I'm not sure about it!");
        String readyOrNot = scanner.next().toUpperCase();

        switch (readyOrNot) {
            case "A":
                System.out.println("Lets GOOOOOOOOOOO!!");
            break;
            case "B":
                System.out.println("Please come back later on!!");
            break;
            default:
                readyTest();

        }



    }
}
