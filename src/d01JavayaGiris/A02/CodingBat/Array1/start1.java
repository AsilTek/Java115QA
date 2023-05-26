package d01JavayaGiris.A02.CodingBat.Array1;

public class start1 {

    public static void main(String[] args) {

        int[] a = {7,2,3};
        int[] b = {1};
        System.out.println(start1(a, b));

    }
    public static int start1(int[] a, int[] b) {

        int count = 0;


            if(a[0] == 1) {
                count++;
            }
            if(b[0] == 1) {
                count++;
            }
        return count;

    }
}
