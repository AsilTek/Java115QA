package d01JavayaGiris.A02.ForWhileSwitch;

public class pyramid {

    public static void main(String[] args) {


        int height = 5; // Specify the height of the pyramid

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print("  "); // Print spaces
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" * "); // Print asterisks
            }
            System.out.println();
        }
    }
}
