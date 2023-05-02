package d01JavayaGiris.A02;


public class Noname1 {

static String classLevelStaticStrVariable = "Class icinde olusturulmus static variable";
String classLevelNonStaticStrVariable = "Class icinde olusturulmus static olmayan variable";

    public static void main(String[] args) {

        String mainMethodVariable = "Main method icinde kullanilan variable";

    }

     void statikOlmayanMethod() {
          String nonStaticMethodStaticVariable = "Static olmayan method icinde kullanilmis static olmayan variable";
         System.out.println(nonStaticMethodStaticVariable);
        //static int staticVariable = 0;
    }
}