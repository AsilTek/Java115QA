package d01JavayaGiris.A02.LowLevelOrIFelse;

import java.util.Scanner;

public class bodyMass {

        public static void main(String[] args) {

            // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
            //         vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
            //         vucut kitle endeksi 30’dan buyukse obez,
            //         25-30 arasi ise kilolu,
            //         20-25 arasi ise normal,
            //         20’den kucukse zayif yazdirin.



            String str = "Java code yaz";

            System.out.println(str.substring(8, 8));

            System.out.println("Vucut kitle endeksini hesaplayacagiz\n");
            System.out.println("Lutfen kilonuzu giriniz");
            Scanner scanner = new Scanner(System.in);
            double kilo = scanner.nextDouble();
            System.out.println("Lutfen boyunuzu cm olarak giriniz");
            double boy = scanner.nextDouble();
            double vke = ((kilo*1000) / (boy*boy));
            if (vke >= 30)
                System.out.println("Malesef obezsiniz");
            else if(vke >= 25 && vke <= 29)
                System.out.println("Malesef Fazla kilolariniz var.");
            else if(vke >= 20 && vke <= 24)
                System.out.println("Normal kilodasiniz.");
            else
                System.out.println("Zayifsiniz.");
        }
    }






