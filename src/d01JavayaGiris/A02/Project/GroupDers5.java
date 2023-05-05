package d01JavayaGiris.A02.Project;

import java.util.Scanner;

public class GroupDers5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String eMail = scanner.nextLine();
        if(!(eMail.endsWith(".com"))) {
            System.out.println("Please enter a valid e-mail address!");
        }
        if(!(eMail.contains("@"))) {
            System.out.println("Please enter a valid e-mail address!");
        }
    }
}
