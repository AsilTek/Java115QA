package d01JavayaGiris.A02.ForWhileSwitch;

public class methodAsalSayi {

    public static void main(String[] args) {

        asalSayi(43);

    }

    public static void asalSayi(int fact){

        boolean asalMi = true;
        for (int i = 2; i < fact ; i++) {
             if(fact % i == 0){
                 asalMi=false;
                 break;
             }
             else {
                 asalMi = true;
             }
        }
        if(asalMi){
            System.out.println("asal sayi degildir");
        }
        else{
            System.out.println("asal sayidir");
        }
    }
}

