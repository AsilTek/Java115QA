package JavaSelfStudy.CodingBatWarmup1_2;

/*

Return true if the given string contains between 1 and 3 'e' chars.
stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class stringE {

    public static void main(String[] args) {


        System.out.println(stringE("helleo"));
        System.out.println(stringE("asil"));


    }

    public static boolean stringE(String str) {

            int sayac = 0;

            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) == 'e')
                    sayac++;
            }
               if(sayac >= 1 && sayac <= 3) {
                   System.out.println("e harfi String icinde "+ sayac+ " tane vardir.");
                   return true;
               }

               return false;
        }
}
