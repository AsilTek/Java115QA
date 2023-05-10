package d01JavayaGiris.A02.Project;

import java.util.*;

public class GroupDers1 {
    static Scanner scanner = new Scanner(System.in);
    static int timeLimit = 20;
    static int count=0;
    public static void main(String[] args) {



       firstQuestion();
       secondQuestion();
       thirdQuestion();
       forthQuestion();
       fifthQuestion();

       System.out.println("CONGRATULATIONS!! You've answered all the questions and have "+count+" correct answers!!");
        System.out.println();
        //DialogBox.messageBox();

        System.out.println("So its time to guess!!! You will have "+count+" guess rights!!");
        List <Integer> numbers = new ArrayList<>();
        for (int i = 0; i <count; i++) {
            int guessNumber = scanner.nextInt();
            numbers.add(guessNumber);
        }
        System.out.println("Lets check one of your numbers are our lucky number or not.");
        int luckyNumber = GroupDers3.randomNumber();
        if (numbers.contains(luckyNumber)) {
            System.out.println("You got it!");
        } else {
            System.out.println("Failed.");

        }
        System.out.println("Lucky number was "+luckyNumber);

        petType();
    }




    public static void firstQuestion () {
        TimerTask timerTask = new TimerTask() {
            public void run() {
                System.out.println("Time's up!");
                scanner.close();
                System.exit(0);
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
                scanner.close();
                System.exit(0);
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
                scanner.close();
                System.exit(0);
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
                scanner.close();
                System.exit(0);
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
    public static void petType() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please choose appropriate options below \n"+
                "If your pet is dog, please enter 1\n"+
                "If your pet is cat, please enter 2\n"+
                "If you have any other type of pet,please enter 3");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                scanner= new Scanner(System.in); //dummy
                System.out.println("Can you type your dog' breed? :");
                String dogBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+dogBreed+" !!  :)" );
                break;
            case 2:
                scanner= new Scanner(System.in); //dummy
                System.out.println("Can you type your cat' breed? :");
                String catBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+catBreed+" !!  :)" );
                break;
            case 3:
                scanner= new Scanner(System.in); //dummy
                System.out.println("Please enter kinds of your pet? :");
                String otherBreed = scanner.nextLine();
                System.out.println("It's so awesome to have "+otherBreed+" !!  :)" );
                break;
            default:
                System.out.println("Invalid pet number.");
        }
    }

}
