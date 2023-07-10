package JavaSelfStudy.ForWhileSwitch;

import java.util.Scanner;

public class switchCcC {

    public static void main(String[] args) {

        System.out.println("Lutfen bir rakam giriniz.");
        Scanner scanner = new Scanner(System.in);
        int rakam = scanner.nextInt();

        switch (rakam){

            case 1:
                System.out.println("Bir");
                break;
            case 2 :
                System.out.println("Iki");
            case 3 :
                System.out.println("Uc");
                break;
            case 4 :
                System.out.println("Dort");
                break;
            case 5 :
                System.out.println("Bes");
                break;
            case 6 :
                System.out.println("Alti");
                break;
            case 7 :
                System.out.println("Yedi");
                break;
            case 8 :
                System.out.println("Sekiz");
                break;
            case 9 :
                System.out.println("Dokuz");
                break;
            case 0 :
                System.out.println("Sifir");
                break;
            default:
                System.out.println("Rakam ne demek bilmiyorsaniz, lutfen Tekrar deneyin");

        }


    }
}
