package d01JavayaGiris.A02.ForWhileSwitch;
import java.util.Scanner;

public class ucerUcerToplam {

    public static void main(String[] args) {

        System.out.print("Lutfen 2 sayi giriniz");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int toplam = 0;
        for (int i = a; i <= b; i++) {
            if(i %3==0) {
                System.out.println("bu sayilar :"+ i +" ");
                toplam+=i; }

        }
        System.out.println("toplami ise :"+ toplam);

    }
}




