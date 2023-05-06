package d01JavayaGiris.A02.Project;

import javax.swing.*;
import java.util.Random;

public class GroupDers3 {



    public static void main(String[] args) {



        // System.out.println(GroupDers4.memberCreate());
       //randomNumber();
       //GroupDers2.messageBox();

    }


    public static int randomNumber() {
        Random random = new Random();
        int number = random.nextInt(20);

        return number;
    }


    /*
    PROJE
    Petsmart cekilisle pet food dagitma uygulamasi.
    Cekilise katilmak icin uye olma ve 5 tane zaman limitli java sorularindan olusan quize girme sarti var.
    Cekilis; bilgisayarin random olarak 0-20 arasinda sectigi sayiyi bulmak. Her denemede sayi degisecek.
    Tahmin; Bunun icin kullanicidan quizden dogru bildigi her soru icin 1 tahmin aliyoruz.
    Yani 5 soruda 3 dogrusu varsa, 3 tahmin hakki oluyor.
    Kullanici sansli sayiyi bulursa, sahip oldugu hayvan hakkinda bilgi aliyoruz.
    Hayvana uygun odulu ve membership kartini veriyoruz.
     */
}
