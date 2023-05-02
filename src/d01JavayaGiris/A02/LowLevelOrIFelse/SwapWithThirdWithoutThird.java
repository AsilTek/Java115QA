package d01JavayaGiris.A02.LowLevelOrIFelse;

public class SwapWithThirdWithoutThird {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println("Before swapping a = " + a + " and b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a = " + a + " and b = " + b);

        System.out.println();


        int x = 5;
        int y = 7;
        int temp;

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        temp = x;
        x = y;
        y = temp;

        System.out.println("After swapping: x = " + x + ", y = " + y);
    }
}


