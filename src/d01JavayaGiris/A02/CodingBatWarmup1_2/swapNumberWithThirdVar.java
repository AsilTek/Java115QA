package d01JavayaGiris.A02.CodingBatWarmup1_2;

public class swapNumberWithThirdVar {

    public static void main(String[] args) {

        //swap two numbers using the third variable?

        int a = 5;
        int b = 8;
        System.out.println("BEFORE a : "+a+"   "+"b : "+b);
        int temp = 0;
        temp = a; // temp = 5;
        a = b; // a = 8;
        b = temp;
        System.out.println("AFTER  a : "+a+"   "+"b : "+b);
    }
}
