package d01JavayaGiris.A02;

import d01JavayaGiris.A02.Project.GroupDers3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class yapsilProgress {

    public static void main(String[] args) {
        System.out.println("So its time to guess!!! You will have 3 guess rights!!");
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <4; i++) {
            int guessNumber = scanner.nextInt();
            numbers.add(guessNumber);
        }

        int luckyNumber = GroupDers3.randomNumber();

        // Check if the number is in the list
        if (numbers.contains(luckyNumber)) {
            System.out.println("You got it!");
        } else {
            System.out.println("Failed.");
        }
        System.out.println("Lucky number was "+luckyNumber);

//        public static void petType() {
//            Scanner scanner= new Scanner(System.in);
//            System.out.println("Please choose appropriate options below \n"+
//                    "If your pet is dog, please enter 1\n"+
//                    "If your pet is cat, please enter 2\n"+
//                    "If you have any other type of pet,please enter 3");
//            int number = scanner.nextInt();
//            switch (number) {
//                case 1:
//                    scanner= new Scanner(System.in);
//                    System.out.println("Can you type your dog' breed? :");
//                    String dogBreed = scanner.nextLine();
//                    System.out.println("It's so awesome to have "+dogBreed+" !!  :)" );
//                    break;
//                case 2:
//                    System.out.println("Can you type your cat' breed? :");
//                    String catBreed = scanner.nextLine();
//                    System.out.println("It's so awesome to have "+catBreed+" !!  :)" );
//                    break;
//                case 3:
//                    System.out.println("Please enter kinds of your pet? :");
//                    String otherBreed = scanner.nextLine();
//                    System.out.println("It's so awesome to have "+otherBreed+" !!  :)" );
//                    break;
//                default:
//                    System.out.println("Invalid pet number.");
//            }

        }

 }

