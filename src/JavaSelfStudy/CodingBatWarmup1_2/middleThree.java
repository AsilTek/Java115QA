package JavaSelfStudy.CodingBatWarmup1_2;
/*

Given a string of odd length, return the string length 3 from its middle,
so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */
public class middleThree {

    public static void main(String[] args) {

        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));


    }

    public static String middleThree(String str) {

        if (str.length() >= 3 && str.length()/2 != 0) {

            int mid = str.length()/2;

             str = str.substring(mid-1,mid+2);
        }
            return str;
    }
}
