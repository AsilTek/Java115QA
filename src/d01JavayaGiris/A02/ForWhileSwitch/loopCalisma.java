package d01JavayaGiris.A02.ForWhileSwitch;

public class loopCalisma {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= 2*n; row++) {
            int cCol = row > n ? 2*n - row  : row;
            for (int col = 1; col <=cCol; col++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }

    }

}
