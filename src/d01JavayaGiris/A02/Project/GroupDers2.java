package d01JavayaGiris.A02.Project;

import javax.swing.*;

public class GroupDers2 {


    public static GroupDers2 messageBox(){
        String name = JOptionPane.showInputDialog("Enter your name");
        //JOptionPane.showMessageDialog(null,"Hello "+name);
        int pass = Integer.parseInt(JOptionPane.showInputDialog("Enter your password"));
        JOptionPane.showMessageDialog(null,"You're logged in successfully");

        GroupDers2 g2 = new GroupDers2();
        return g2;
    }


}
