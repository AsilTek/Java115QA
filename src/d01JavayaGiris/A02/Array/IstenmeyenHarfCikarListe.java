package d01JavayaGiris.A02.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IstenmeyenHarfCikarListe {

    // Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
    // kismini list olarak bize donduren bir method olusturun
    public static void main(String[] args) {

        System.out.println("Lutfen istemediginiz harfi girin");

// Kullanicidan silinmesini istedigimiz harf almak icin Scanner object kurduk
        Scanner scanner = new Scanner(System.in);
        char harf = scanner.next().toLowerCase().charAt(0);
        System.out.println(istenmeyenHarf(harf));
    }

    public static List<String> istenmeyenHarf (char harf) {

//Isimlerden olusan bir List olusturduk ve print ettik
        List<String> kelimeler = new ArrayList<>();
        kelimeler.add("kalem");
        kelimeler.add("defter");
        kelimeler.add("telefon");
        kelimeler.add("bardak");

// Harf silinmesi sonrasi kalan isimler icin List olusturduk
        List<String> kalanKelimeler = new ArrayList<>();

//for loop ile kelimeler listesini dondurduk ve if ile olmasini istemedigimiz harfi cikararak yeni listeye ekledik.
        for (int i = 0; i < kelimeler.size(); i++) {
            if(!(kelimeler.get(i).contains(harf+""))) {
                kalanKelimeler.add(kelimeler.get(i));
            }

        }
        return kalanKelimeler;
    }
}
