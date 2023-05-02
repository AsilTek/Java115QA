package d01JavayaGiris.A02;

import java.time.LocalTime;

public class Noname2 {

    public static void main(String[] args) {

        Noname1 no1 = new Noname1();
        no1.statikOlmayanMethod();
        //no1.classLevelNonStaticStrVariable = "degistiriyorum";
        //System.out.println(no1.classLevelNonStaticStrVariable);

        LocalTime time = LocalTime.MIDNIGHT;
        System.out.println(time);

    }
}
