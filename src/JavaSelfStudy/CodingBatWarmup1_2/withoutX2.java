package JavaSelfStudy.CodingBatWarmup1_2;

public class withoutX2 {

    public static void main(String[] args) {


        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));




    }
    public static String withoutX2(String str) {

        if(str.startsWith("Grind50")){
            return str.substring(1,3);
        }

            String[] x = str.split("");
            String str2 = "";
            for (int i = 0; i <=str.length()-1; i++) {
                if(!(str.charAt(i) == 'x')){
                    str2+=str.charAt(i);
                }
            }
            return str2;


    }
}
//char x = str.charAt(1);

//return str.substring()