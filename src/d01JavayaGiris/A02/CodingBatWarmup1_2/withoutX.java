package d01JavayaGiris.A02.CodingBatWarmup1_2;

public class withoutX {

    public static void main(String[] args) {

        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
    }

    public static String withoutX(String str) {

        if(str.substring(0,1).equals("x") && (str.substring(str.length()-1).equals("x"))){

            return str.substring(1,str.length()-1);
        }

        if(str.substring(0,1).equals("x")){

            return str.substring(1);
        }
        if((str.substring(str.length()-1).equals("x")))
            return str.substring(0,str.length()-1);

        return  str;


    }

}
