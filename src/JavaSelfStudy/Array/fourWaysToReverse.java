package JavaSelfStudy.Array;

public class fourWaysToReverse {

    public static void main(String[] args) {
        String s ="Asil";

        //1.yol StringBuilder ile
        StringBuilder str = new StringBuilder(s);
        System.out.println(str.reverse());
        //2.yol charAt ile
        String s1 = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            s1+=s.charAt(i);
        }
        System.out.println(s1);

        //3.yol split methodu ile
        String[] a = new String[4];
        String[] s2 = s.split("");
        for (int i = s2.length-1,j=0; i >= 0 ; i--,j++) {
            a[j] = s2[i];
        }
        System.out.println(String.join("", a));

        //4.yol while loop ile
        int i = 0;
        int index = s.length()-1;
        String reversedArr = "";
        while(index>=0){
            reversedArr+=s.charAt(index);
            i++;
            index--;
        }
        System.out.println(reversedArr);

    }

}
