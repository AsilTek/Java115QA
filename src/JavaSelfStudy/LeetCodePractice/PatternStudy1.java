package JavaSelfStudy.LeetCodePractice;

public class PatternStudy1 {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <row+1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n+1; i++) {
            System.out.print("* ");
        }
        System.out.println();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j <i;j++) {
                System.out.print("  ");
            }
            //star
            for (int j = 0; j <2*(n-i)-1; j++) {
                System.out.print("* ");
            }
            //space
            for (int j = 0; j <i;j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");

        for (int i = 0; i < 2 * n - 1; i++) {
            int row = i;
            if(i > n - 1) {
                row = (2 * n) - i -1;
            }else{
                row = i + 1;
            }
            for (int j =0 ; j <row; j++) {
                    System.out.print("o ");
                }
                System.out.println();
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");

        for (int i = 0; i < n; i++ )
        {
            for (int j = 0 ; j < n; j++ )
            {
                if (i == n - 1 || i  == 0 || j == 0 ||  j == n-1)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n");

        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if(j == 0 || i == n-1 || i == j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
