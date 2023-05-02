package d01JavayaGiris.A02.Array;

public class  EnUzunEnKisaKelime {


    public static void main(String[] args) {

        String[] arry = {"Asil","Ozlem","Emirhan"};
        EnUzunEnKisa(arry);

    }


    public static void EnUzunEnKisa( String[] arry){

        String enUzun = arry[0];
        String enKisa = arry[0];

        for (int i = 0; i <arry.length; i++) {
            if (enKisa.length() > arry[i].length()) {
                enKisa = arry[i];
            }
            if (enUzun.length() < arry[i].length()) {
                enUzun = arry[i];
            }

        }
        System.out.println("en uzun kelime: "+enUzun);
        System.out.println("en kisa kelime: "+enKisa);

    }

}