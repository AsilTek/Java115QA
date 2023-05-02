package d01JavayaGiris.A02.ForWhileSwitch;

import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayac = 0;
        while (toplam <500) {
            System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        toplam += sayi;
        sayac++;

        }
        System.out.println(sayac+ " adet");
        System.out.println("toplam "+ toplam+" oldu");
    }
}
