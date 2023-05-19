package d01JavayaGiris.A02.Project;

import java.util.Scanner;

public class GroupDers4 {
    public static void main(String[] args) {
        memberCreate();
    }


    String name,lastName,eMail;
    String dob;

    GroupDers4(String name,String lastName,String dob, String eMail) {
        this.name = name;
        this.lastName = lastName;
        this.dob = dob;
        this.eMail=eMail;
    }
    GroupDers4(){

    }

    public  static GroupDers4 memberCreate () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = scanner.nextLine();
        System.out.print("Enter your Last Name :");
        String lastName = scanner.nextLine();
        System.out.print("Enter your Birthdate (YYYY) :");
        String dob = scanner.nextLine();{
            boolean containsLetter = false;

            for (int i = 0; i < dob.length(); i++) {
                if (Character.isLetter(dob.charAt(i))) {
                    containsLetter = true;
                    break;
                }
            }
            if(dob.length() > 4 || containsLetter){
                System.out.println("Please enter your birth date info in shown format ");
                System.out.print("Enter your Birthdate (YYYY) :");
                dob = scanner.nextLine();
            }
        int year = Integer.parseInt(dob);
        int age = 2023 - year;
        }
        System.out.print("Enter your email :");
        String eMail = scanner.nextLine(); {
            if (!(eMail.endsWith(".com"))) {
                System.out.println("Please enter a valid e-mail address!");
            }
            if (!(eMail.contains("@"))) {
                System.out.println("Please enter a valid e-mail address!");
            }
        }
        System.out.println("Hi "+name+" "+lastName+". We just got your information.");

        GroupDers4 g1 = new GroupDers4(name, lastName, dob, eMail);

        return g1;

    }

}
