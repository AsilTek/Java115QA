package d01JavayaGiris.A02.Project;

//import d01JavayaGiris.A02.Project.GirisBolumu;
//import d01JavayaGiris.A02.Project.GroupDers1;
//import d01JavayaGiris.A02.Project.GroupDers3;
//import d01JavayaGiris.A02.Project.GroupDers4;

import javax.swing.*;
import java.util.*;
import java.util.Timer;

public class SonDurum {
    String name,lastName,eMail,dob;
    static int count =0;
    static int timeLimit = 20;
    static Scanner scanner = new Scanner(System.in);

    SonDurum(String name,String lastName,String dob, String eMail) {
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.eMail=eMail;
    }


    public static void main(String[] args) {


       //greetingQuiz();
        memberCreate();
        readyTest();
        firstQuestion();
        secondQuestion();
        thirdQuestion();
        forthQuestion();
        fifthQuestion();
        printResult();
        petType();

    }
    SonDurum(){

    }

    public static void greetingQuiz (){

        System.out.println("                    WELCOME ONBOARD!!\n");

        System.out.println ("     .*. PETSMART & WISEQUARTER PARTNERSHIP PRESENTS .*.\n ");

        System.out.println("ANSWER 5 CORE JAVA QUESTIONS and GET THE BIG PRIZE!! \n");

        System.out.println("LETS TAKE A LOOK THROUGH THE RULES\n"+
                " 1.to participate in the draw, you must first create a membership. In this way, you will have the chance to take advantage of other opportunities.\n "+
                "2.You will have 5 time limited questions. You should answer each of them in 20 seconds!\n" +
                " 3.For every correct answer you make, you will get 1 guess right.\n" +
                " 4.At the end of the quiz, you will have guess rights as sum of your correct answers ex. 3 correct answers out of 5 means 3 guess rights\n"+
                " 5.In the draw, you will guess number between 1-20 and should match with the chosen number by computer to be rewarded.\n"+
                " 6.Reward will be massive amount of food for your pet\n");
        System.out.println("Lets start with membership process.Please stick with following steps... \n");

    }

    public  static SonDurum memberCreate () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String newName = name.toUpperCase().charAt(0) + name.substring(1).toLowerCase();
        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();
        String newLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.print("Enter your Birthdate (YYYY): ");
        String dob = scanner.nextLine();{
            boolean containsLetter = false;

            for (int i = 0; i < dob.length(); i++) {
                if (Character.isLetter(dob.charAt(i))) {
                    containsLetter = true;
                    break;
                }
            }
            if(!(dob.length() == 4) || containsLetter){
                System.out.println("Please enter your birth date info in shown format ");
                System.out.print("Enter your Birthdate (YYYY): ");
                dob = scanner.nextLine();
            }
            int year = Integer.parseInt(dob); // belki yasini biyerde kullanirim
            int age = 2023 - year;
        }
        System.out.print("Enter your email: ");
        String eMail = scanner.nextLine(); {
            if (!(eMail.endsWith(".com")) || !(eMail.contains("@"))) {
                System.out.println("Please enter a valid e-mail address!");
                System.out.print("Enter your email: ");
                eMail = scanner.nextLine();
            }
        }
        System.out.println();
        System.out.println("Hi "+newName+" "+newLastName+". We just got your information.\n");

        SonDurum g1 = new SonDurum(name, lastName, dob, eMail);

        return g1;

    }

    public static void readyTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ready to take the Quiz????");
        System.out.println("A. Yes lets go!!     B. I'm not sure about it!");
        String readyOrNot = scanner.next().toUpperCase();

        switch (readyOrNot) {
            case "A":
                System.out.println("Lets GOOOOOOOOO!!\n");
                System.out.println("REMEMBER YOU HAVE 20 SECONDS FOR EACH QUESTION.");
                break;
            case "B":
                System.out.println("Please come back later on!!");
                break;
            default:
                readyTest();

        }
    }

    public static void firstQuestion () {
        TimerTask timerTask = new TimerTask() {
            public void run() {
                System.out.println("Time's up!");
                //scanner.close();
                System.out.println("You missed the question. Lets go with the next one! \n");
                secondQuestion();
                //System.exit(0);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, timeLimit * 1000);
        System.out.println("Q.1 - When you declare ______ datatypes, then ______  are responsible for converting them into objects(Reference types).");
        System.out.println("   A - primitive, modifiers \n"+
                "   B - non-primitive, constructors\n"+
                "   C - primitive, wrapper classes");
        String answer1 = scanner.nextLine().toUpperCase();
        System.out.println("   Your answer is: " + answer1);
        if (answer1.equals("C")) {
            System.out.println("   YOUR ANSWER IS CORRECT !!!");
            System.out.println();
            count++;
        }else{
            System.out.println("   YOU FAILED!");
        }
        timerTask.cancel();
        timer.cancel();
    }

    public static void secondQuestion () {
        TimerTask timerTask = new TimerTask() {
            public void run() {
                System.out.println("Time's up!");
                //scanner.close();
                System.out.println("You missed the question. Lets go with the next one! \n");
                thirdQuestion();
                //System.exit(0);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, timeLimit * 1000);
        System.out.println("Q.2 - What happens when the main() isn't declared as static?");
        System.out.println("   A - the program can be compiled correctly \n"+
                "   B - there is no way you run the code \n"+
                "   C - the program will give CTE in any circumstances ");
        String answer2 = scanner.nextLine().toUpperCase();
        System.out.println("Your answer is: " + answer2);
        if (answer2.equals("A")) {
            System.out.println("   YOUR ANSWER IS CORRECT !!!");
            System.out.println();
            count++;
        }else{
            System.out.println("   YOU FAILED!");
        }
        timerTask.cancel();
        timer.cancel();
    }

    public static void thirdQuestion () {
        TimerTask timerTask = new TimerTask() {
            public void run() {
                System.out.println("Time's up!");
                //scanner.close();
                System.out.println("You missed the question. Lets go with the next one! \n");
                forthQuestion();
                //System.exit(0);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, timeLimit * 1000);
        System.out.println("Q.3 - Stringbuilder is ________ and ______ multi-thread operation. It is _____ than StringBuffer ");
        System.out.println("   A - immutable, does no support, faster \n"+
                "   B - immutable,supports, faster \n"+
                "   C - mutable,does not support, slower");
        String answer2 = scanner.nextLine().toUpperCase();
        System.out.println("Your answer is: " + answer2);
        if (answer2.equals("A")) {
            System.out.println("   YOUR ANSWER IS CORRECT !!!");
            System.out.println();
            count++;
        }else{
            System.out.println("   YOU FAILED!");
        }
        timerTask.cancel();
        timer.cancel();
    }

    public static void forthQuestion () {
        TimerTask timerTask = new TimerTask() {
            public void run() {
                System.out.println("Time's up!");
                //scanner.close();
                System.out.println("You missed the question. Lets go with the next one! \n");
                fifthQuestion();
                //System.exit(0);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, timeLimit * 1000);
        System.out.println("Q.4 - Varargs does not give a ___ when the number of parameters is ___, it creates an _____.");
        System.out.println("   A - RTE, more than 1, array \n"+
                "   B - CTE, 0, empty array \n"+
                "   C - CTE, 0, arrayList");
        String answer2 = scanner.nextLine().toUpperCase();
        System.out.println("Your answer is: " + answer2);
        if (answer2.equals("B")) {
            System.out.println("   YOUR ANSWER IS CORRECT !!!");
            System.out.println();
            count++;
        }else{
            System.out.println("   YOU FAILED!");
        }
        timerTask.cancel();
        timer.cancel();
    }

    public static void fifthQuestion () {
        TimerTask timerTask = new TimerTask() {
            public void run() {
                System.out.println("Time's up!");
                scanner.close();
                System.exit(0);
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask, timeLimit * 1000);
        System.out.println("Q.5 - Which of the following is not true for 'this' keyword?");
        System.out.println("   A - this keyword is used with the objects only. \n"+
                "   B - it is used to refer to the constructor belonging to the same class. \n"+
                "   C - it is used to differentiate between the local variable and the instance variable in the method.");
        String answer2 = scanner.nextLine().toUpperCase();
        System.out.println("Your answer is: " + answer2);
        if (answer2.equals("B")) {
            System.out.println("   YOUR ANSWER IS CORRECT !!!");
            System.out.println();
            count++;
        }else{
            System.out.println("   YOU FAILED!");
        }
        timerTask.cancel();
        timer.cancel();
    }

    public static void printResult (){
        System.out.println("CONGRATULATIONS!! You've answered all the questions and have "+count+" correct answers!!");
        System.out.println();
        //DialogBox.messageBox();

        System.out.println("So its time to guess!!! You will have "+count+" guess rights!!");
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <count; i++) {
            int guessNumber = scanner.nextInt();
            numbers.add(guessNumber);
        }
        System.out.println("Lets check one of your numbers are our lucky number or not.");
        int luckyNumber = randomNumber();
        if (numbers.contains(luckyNumber)) {
            System.out.println("You got it!");
        } else {
            System.out.println("Failed.");

        }
        System.out.println("Lucky number was "+luckyNumber);
    }

    public static int randomNumber() {
        Random random = new Random();
        int number = random.nextInt(10);

        return number;
    }

    public static void petType() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please choose appropriate options below \n"+
                "If your pet is dog, please enter 1\n"+
                "If your pet is cat, please enter 2\n"+
                "If you have any other type of pet,please enter 3");
        int number = scanner.nextInt();
        String otherBreed = scanner.nextLine();
        switch (number) {
            case 1:
                scanner= new Scanner(System.in); //dummy
                System.out.println("Can you type your dog' breed? :");
                String dogBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+dogBreed+" !!  :)\n" );
                break;
            case 2:
                scanner= new Scanner(System.in); //dummy
                System.out.println("Can you type your cat' breed? :");
                String catBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+catBreed+" !!  :)\n" );
                break;
            case 3:
                scanner= new Scanner(System.in); //dummy
                System.out.println("Please enter kinds of your pet? :");
                otherBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+otherBreed+" !!  :)\n" );
                break;
            default:
                System.out.println("Invalid pet number.\n");
        }
        if(number == 1){
            System.out.println("CONGRATULATIONS! You will get 10 lb of dog food for your from us");
        }
        if(number == 2) {
            System.out.println("CONGRATULATIONS! You will get 10lb of cat food for your from us.");
        }
        else {
            System.out.println("CONGRATULATIONS! You will get 10lb of "+otherBreed+" food from us.");
        }

    }

    public static DialogBox messageBox(){
        String name = JOptionPane.showInputDialog("Enter your name");
        //JOptionPane.showMessageDialog(null,"Hello "+name);
        int pass = Integer.parseInt(JOptionPane.showInputDialog("Enter your password"));
        JOptionPane.showMessageDialog(null,"You're logged in successfully");

        DialogBox g2 = new DialogBox();
        return g2;
    }

    public static String askFullName() {
        String fName = JOptionPane.showInputDialog("Enter your first name:");
        String lName = JOptionPane.showInputDialog("Enter your last name:");
        return "Hi "+ fName + " " + lName+". You're logged in successfully";
    }

}
