package d01JavayaGiris.A02.Project;

import javax.swing.*;
import java.util.Random;

public class GroupDers3 {



    public static void main(String[] args) {



       System.out.println(GroupDers4.memberCreate());
       randomNumber();
       //GroupDers2.messageBox();
       System.out.println(GroupDers2.messageBox());

    }


    public static void randomNumber() {
        System.out.println("Please use the password created for you below to log in");
        Random random = new Random();
        int number = random.nextInt(10000);
        System.out.println("Your one-time password :"+number);

    }

}
