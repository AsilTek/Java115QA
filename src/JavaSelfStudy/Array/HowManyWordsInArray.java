package JavaSelfStudy.Array;

import java.util.Arrays;

public class HowManyWordsInArray {
//how many words are in the string?
    public static void main(String[] args) {

        String str = "Java is so good to be true";
        //System.out.println(str.replace(" ",","));
        String[] str2 = str.split(" ");
        System.out.println(Arrays.toString(str2));
        System.out.println("There are "+str2.length+" words in the String");
    }
}
