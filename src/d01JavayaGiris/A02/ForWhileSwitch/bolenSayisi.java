package d01JavayaGiris.A02.ForWhileSwitch;

import java.util.Scanner;

public class bolenSayisi {

    public static void main(String[] args) {

        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();


        System.out.println(tamBolen(sayi));

    }

    public static int tamBolen (int sayi) {


        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if(sayi % i == 0){
               // System.out.print(i+" ");
                sayac++;
            }


        }
        return sayac;
    }
}
