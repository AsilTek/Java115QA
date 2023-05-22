package d01JavayaGiris.A02.PetsmartProject;

import javax.swing.*;

public class DialogDersGecme {

    public static void main(String[] args) {

        /* Kullanıcıdan alacağımız değişkenleri oluşturuyoruz. */
        int vizeNotu  = 0;
        int finalNotu = 0;

        /* Kullanıcıdan vize notunu InputDialog penceresi ile alıyoruz */
        vizeNotu = Integer.parseInt(JOptionPane.showInputDialog("Vize notunuzu giriniz."));
        while (vizeNotu<0||vizeNotu>100) {
            vizeNotu = Integer.parseInt(JOptionPane.showInputDialog
                    ("Vize notunuzu giriniz.\nGirilen not 0 ile 100 arasında olmalıdır."));
        }

        /* Kullanıcıdan final notunu InputDialog penceresi ile alıyoruz */
        finalNotu = Integer.parseInt(JOptionPane.showInputDialog(null,"Final notunuzu giriniz.","Final Sonucu", JOptionPane.INFORMATION_MESSAGE));
        while (finalNotu<0||finalNotu>100) {
            finalNotu = Integer.parseInt(JOptionPane.showInputDialog
                    ("Final notunuzu giriniz.\nGirilen not 0 ile 100 arasında olmalıdır."));
        }

        /* Sonucu hesaplayı sonuca göre mesaj verilmesi için if-else yapısını kullanıyoruz */
        double sonuc = ((vizeNotu*0.4)+(finalNotu*0.6));
        String msj;
        if (sonuc>55) {
            msj = "Dersi geçtiniz. Sonuç: " + sonuc;
        }
        else{
            msj = "Dersten kaldınız. Sonuç: " + sonuc;
        }

        /* En son olarakta MessageDialog penceresi ile kullanıcıya sonucu veriyoruz. */
        JOptionPane.showMessageDialog(null, msj, "Sonuç" , JOptionPane.INFORMATION_MESSAGE);
    }
}

