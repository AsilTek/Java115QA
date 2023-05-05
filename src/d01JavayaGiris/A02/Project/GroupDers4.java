package d01JavayaGiris.A02.Project;

import java.util.Scanner;

public class GroupDers4 {


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
            if(dob.length() > 4){
                System.out.println("Please enter 4-digit Birthdate as the form of YYYY ");
            }
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


        GroupDers4 g1 = new GroupDers4(name, lastName, dob, eMail);

        return g1;

    }

}
