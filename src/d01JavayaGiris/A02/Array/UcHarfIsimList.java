package d01JavayaGiris.A02.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UcHarfIsimList {

    public static void main(String[] args) {

        System.out.println(isimListesi());

    }


    public static List<String> isimListesi() {

        Scanner scanner = new Scanner(System.in);
        List<String> isimListesi = new ArrayList<>();
        String isim = "    ";

        while (isim.length() > 3) {

            System.out.println("Lutfen 3 harften uzun olan isimler yazin");
            isim = scanner.next();
            if (isim.length() > 3) {
                isimListesi.add(isim);
            }

        }
        return isimListesi;
    }
}

