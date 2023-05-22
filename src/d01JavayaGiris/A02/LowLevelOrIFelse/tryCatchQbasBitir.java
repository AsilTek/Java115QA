package d01JavayaGiris.A02.LowLevelOrIFelse;

import java.util.Scanner;

public class tryCatchQbasBitir {

    //Kullanici dan toplamak icin sayilar al. Hata verirse hata mesaji yazdir. Q ya bastiginda bitir ve sonucu goster.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String m = "";
        int sayac = 0;
        int toplam = 0;
        boolean x = true;

        while(x) {
            try {
                System.out.println("please enter integer");
                int a = scanner.nextInt();
                sayac++;
                toplam+=a;

            } catch (Exception e) {
                  m = scanner.next();
                if(m.equals("q")) {
                    x = false;
                }else {
                    System.out.println("It has to be an integer!!");
                }
            }
        }

        System.out.println(sayac+"  "+toplam);

    }
}
