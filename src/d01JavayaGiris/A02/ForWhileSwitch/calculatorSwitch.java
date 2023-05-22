package d01JavayaGiris.A02.ForWhileSwitch;

public class calculatorSwitch {


        public static void main(String[] args) {

            calculator(16,4,'+');


        }


        public static void calculator(int a, int b, char c) {

            switch (c) {
                case '*':
                    System.out.println(a+" ile "+b+" nin carpimi : " +(a*b));
                    break;
                case '+':
                    System.out.println(a+" ile "+b+" nin toplami : " +(a+b));
                    break;
                case '/':
                    System.out.println(a+" nin "+b+" ye bolumu : " +(a/b));
                    break;
                case '-':
                    System.out.println(a+" dan "+b+" cikarimi : " +(a*b));
                    break;
                default:
                    System.out.println("cikis yap");
            }


        }
    }


