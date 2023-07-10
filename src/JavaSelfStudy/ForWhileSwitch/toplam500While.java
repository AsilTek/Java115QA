package JavaSelfStudy.ForWhileSwitch;

import java.util.Scanner;

public class toplam500While {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int toplam =0;
        int sayac = 0;
        int sayi = 1;

        while (!(sayi == 0)) {
            System.out.println("Lutfen sayi giriniz. Bitirmek icin 0'a basiniz");
            sayi = scanner.nextInt();
            toplam +=sayi;
            sayac++;
            if(sayi == 0){

                System.out.println(sayac+" adet giris yapildi");
            }
            if(sayi < 0){
                System.out.println("Lutfen pozitif bir sayi giriniz");
            }
        }System.out.println("toplam : "+toplam);

    }
}
