package d01JavayaGiris.A02.Project;

import java.util.*;

import static java.lang.System.*;
public class groupDers {
    static Scanner scanner = new Scanner(System.in);
    static int timeLimit = 10;
    public static void main(String[] args) {

        System.out.println("");

        System.out.println("WELCOME ONBOARD! ANSWER FOLLOWING QUESTIONS PLEASE");

        firstQuestion();
        midQuestion();

    }
    static void midQuestion (){
        System.out.println("Are you ready for the next question?");
        String mainAnswer = scanner.nextLine().toUpperCase();
        if(mainAnswer.equals("Y")){
            System.out.println("Keep up m*****!!");
            secondQuestion();
        }else {
            System.out.println("You coward!!");
        }
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
        System.out.println("What is local variable?");
        System.out.println("A - Variables defined inside methods, constructors or blocks are called local variables.\n"+
                "B - Variables defined outside methods, constructors or blocks are called local variables.\n"+
                "C - Static variables defined outside methods, constructors or blocks are called local variables.");
        String answer1 = scanner.nextLine().toUpperCase();
        System.out.println("Your answer is: " + answer1);
        if (answer1.equals("A")) {
            System.out.println("You got it !!!");
        }else{
            System.out.println("You failed");
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
        System.out.println("What does the expression float a = 35 / 0 return?");
        System.out.println("A - 0 \n"+
                "B - Infinity \n"+
                "C - Run time exception ");
        String answer2 = scanner.nextLine().toUpperCase();
        System.out.println("Your answer is: " + answer2);
        if (answer2.equals("B")) {
            System.out.println("You got it !!!");
        }else{
            System.out.println("You failed");
        }
        timerTask.cancel();
        timer.cancel();
    }



}
