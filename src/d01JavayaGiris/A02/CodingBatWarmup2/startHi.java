package d01JavayaGiris.A02.CodingBatWarmup2;
/*

Given a string, return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false
 */
public class startHi {

    public static void main(String[] args) {

        startHi st = new startHi();
        System.out.println(st.startHi("hello hi"));

    }

    public  boolean startHi(String str) {

        if(str.startsWith("hi")){
            return true;
        }
        return false;
    }
}
