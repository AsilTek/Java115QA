package d01JavayaGiris.A02.Array;

public class matchKullanimi {

    public static void main(String[] args) {

        String str = "va bny svgdr";

        //[] varsa icinde yazdigin herhangi bir karakteri kontrol eder
        //() varsa onun tamaminin String de olup olmadigini kontrol eder.
        //basinda sonunda *. varsa String blogunun tamamina bakar.
        //basinda .* olup sonunda yoksa String o kelime ile bitmelidir
        System.out.println(str.matches(".*[aeiou].*"));
        System.out.println(str.contains("a"));
        System.out.println(str.matches(".*(svgdr)"));
    }
}
