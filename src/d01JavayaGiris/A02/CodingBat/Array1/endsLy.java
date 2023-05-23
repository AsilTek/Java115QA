package d01JavayaGiris.A02.CodingBat.Array1;
/*
Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
public class endsLy {

    public static void main(String[] args) {

        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));

    }
    public static boolean endsLy(String str) {

        if(str.endsWith("ly")) {
        return true;
    }
        return false;
}
}
