package d01JavayaGiris.A02.Array;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciOrtalama {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        List<Integer> notListesi = new ArrayList<>();
        int toplam = 0;
        int sayac = 0;
        int sayac2 = 0;
        int notlar = 1;

        while (!(notlar == 0)) {

            System.out.println("Lutfen Ogrencinin notunu giriniz ve bitirmek icin 0'a basiniz ");
            notlar = scanner.nextInt();
            if (!(notlar == 0)) {
                notListesi.add(notlar);
                toplam += notlar;
                sayac++;

                for (int i = 0; i < notListesi.size(); i++) {
                    if (notListesi.get(i) > (toplam / sayac)) {
                        sayac2++;
                    }
                }
            }



            System.out.println("Ogrencilerin notlarinin ortalamasi = " + toplam / sayac);
            System.out.println("ortalama ustu ogrenci sayisi : " + sayac2);
        }
    }
}
