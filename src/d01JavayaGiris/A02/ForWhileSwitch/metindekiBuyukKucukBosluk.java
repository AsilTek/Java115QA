package d01JavayaGiris.A02.ForWhileSwitch;

public class metindekiBuyukKucukBosluk {

    public static void main(String[] args) {

        String metin = "Java gercekten zor bir konu";
        int kucukHarf = 0;
        int buyukHarf = 0;
        int bosluk =0;
        for (int i = 0; i < metin.length(); i++) {
            if(metin.charAt(i) >= 'a' && metin.charAt(i) <= 'z') {
                kucukHarf++;
            } else if(metin.charAt(i) >= 'A' && metin.charAt(i) <= 'Z') {
                buyukHarf++;
            }
            else if (metin.charAt(i) == ' ') {
                bosluk++;
            }

        }
        System.out.println(buyukHarf+" "+kucukHarf+" "+bosluk);
    }
}
