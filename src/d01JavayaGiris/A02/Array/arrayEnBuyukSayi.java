package d01JavayaGiris.A02.Array;

public class arrayEnBuyukSayi {


    public static void main(String[] args) {


        int[] arr = {2, 4, 6, 0, -1, 1, 3, 8, 2};

        System.out.println(enBuyukSayiyiBul(arr));


    }

    public static int enBuyukSayiyiBul(int[] arr) {
        int enBuyuk = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > enBuyuk) {
                enBuyuk = arr[i];
            }
        }

        return enBuyuk;
    }
}

