package d01JavayaGiris.A02.CodingBatWarmup1_2;

import java.util.Random;
import java.util.Scanner;

public class zarOyunuTr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hosgeldin! Sana en uygun sekilde hitap edebilmem icin ismini alabilir miyim? ");
        String isim = scanner.next();
        String isim2 = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        System.out.println("Harika!! Tekrar hosgeldin "+ isim2+"!\n");
        System.out.println("Bu bir zar atma oyunudur. Daha anlasilir olmak icin oyun hakkindaki aciklamalari adim adim yazayim.\n\n" +
                "1.Bildigin gibi zar uzerinde 1 den 6 ya kadar rakamlar var.\n" +
                "2.Attigin zarlarin toplami, benim attigim zarlarin toplamindan fazlaysa sen kazanirsin!\n" +
                "3.Oyunu istedigin kadar oynayabiliriz. \n\n" +
                "Simdi hersey anlasildiysa oyuna gecelim...\n ");
        System.out.println("Kac kere oynamak istiyorsun?");
        int kacKere = scanner.nextInt();
        int benimKazanmaSayisi = 0;
        int seninKazanmaSayin = 0;
        int ilk = 1;

        while (ilk <= kacKere) {
            System.out.println("-------- " + ilk + ".Tur--------");
            int benimToplam = benimRandom();
            System.out.println("Attığın zarların toplamı: " + benimToplam+"\n");
            int computerToplam = computerRandom();
            System.out.println("Benim attığım zarların toplamı: " + computerToplam+"\n");


            if (benimToplam > computerToplam) {
                System.out.println("** SEN KAZANDIN! **");
                seninKazanmaSayin++;
            } else if (benimToplam < computerToplam) {
                System.out.println("** BEN KAZANDIM! **");
                benimKazanmaSayisi++;
            } else {
                System.out.println("** BERABERE! **");
            }
            System.out.println();
            ilk++;
        }
        System.out.println("**************************************");
        System.out.println("OYUN SONUNDA;  \nSen "+seninKazanmaSayin+" kere, Ben "+benimKazanmaSayisi+" kere kazandim.");
        System.out.println("**************************************");

    }

    public static int benimRandom() {
        Random random = new Random();
        int ilkZar = random.nextInt(6) + 1;
        int ikinciZar = random.nextInt(6) + 1;
        int toplam = ilkZar + ikinciZar;
        System.out.println("Attığın zarlar: " + ilkZar + " ve " + ikinciZar);
        return toplam;
    }

    public static int computerRandom() {
        Random random = new Random();
        int ilkZar = random.nextInt(6) + 1;
        int ikinciZar = random.nextInt(6) + 1;
        int toplam = ilkZar + ikinciZar;
        System.out.println("Benim attığım zarlar: " + ilkZar + " ve " + ikinciZar);
        return toplam;
    }
}
