package d01JavayaGiris.A02.Project;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DialogBox {

    public static void main(String[] args) {

        
       //messageBox();
//        String fullName = askFullName();
//        JOptionPane.showMessageDialog(null, "Hello, " + fullName + "!");
       


    }

//    public static DialogBox messageBox(){
//        String name = JOptionPane.showInputDialog("Enter your name");
//        //JOptionPane.showMessageDialog(null,"Hello "+name);
//        int pass = Integer.parseInt(JOptionPane.showInputDialog("Enter your password"));
//        JOptionPane.showMessageDialog(null,"You're logged in successfully");
//
//        DialogBox g2 = new DialogBox();
//        return g2;
//    }

    public static String askFullName() {
        String fName = JOptionPane.showInputDialog("Enter your first name:");
        String lName = JOptionPane.showInputDialog("Enter your last name:");
        return "Hi "+ fName + " " + lName+". You're logged in successfully";
    }
//
//
//    public static void rewardIDprint(){
//        //Reward icin petType G1 den pet ve breed gelecek = rewardPet
//        //ID icin             G4 ten memberCreate methodu cagir ve print et

//    String[] parts = dob.split("-");
//    int year = Integer.parseInt(parts[0]);
//    int month = Integer.parseInt(parts[1]);
//    int day = Integer.parseInt(parts[2]);
//    LocalDate birthDate = LocalDate.of(year,month,day);
//    LocalDate today = LocalDate.now();
//    Period ageUser = Period.between(birthDate,today);
//            System.out.println(ageUser);

}
