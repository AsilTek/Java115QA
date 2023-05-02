package d01JavayaGiris.A02.LowLevelOrIFelse;

import java.util.Scanner;
public class toplamaCikarma {

    public static void main(String[] args) {

        System.out.println("Lutfen bir tamsayi giriniz");
        Scanner scanner = new Scanner(System.in);
        int ilkSayi = scanner.nextInt();
        System.out.println("Lutfen bir tamsayi giriniz");
        int ikinciSayi = scanner.nextInt();
        System.out.println("Islem turunu seciniz :\n\t 1 Toplama \n\t 2 Cikarma \n\t 3 Carpma \n\t 4 Bolme");
        char sign = scanner.next().charAt(0);
        if (sign == '+')
        System.out.println(ilkSayi + ikinciSayi);
        else if (sign == '-')
        System.out.println(Math.abs(ilkSayi - ikinciSayi));
        else if (sign == '*')
        System.out.println(ilkSayi * ikinciSayi);
         else if (sign == '/')
            if(ikinciSayi == 0) System.out.println("Bolen Sifir olamaz");
            else  System.out.println(ilkSayi / ikinciSayi);
        else System.out.println("Yanlis giris yaptiniz, lutfen tekrar deneyiniz!");





    }


}
