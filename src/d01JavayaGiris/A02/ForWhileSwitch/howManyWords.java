package d01JavayaGiris.A02.ForWhileSwitch;

import java.util.Scanner;

public class howManyWords {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen cumle girin");
        String cumle = scan.nextLine();

//        String[] a =cumle.split(" ");
//        System.out.println(a.length);
        int count =0;
        for (int i = 0; i <cumle.length(); i++) {
            if(cumle.charAt(i) ==' ')
                count++;

        }
        System.out.println(count+1+" adet kelime var");

    }
}
