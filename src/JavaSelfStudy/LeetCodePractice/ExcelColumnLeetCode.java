package JavaSelfStudy.LeetCodePractice;

public class ExcelColumnLeetCode {


    public static void main(String[] args) {
        String excelLetter = "AA";
        System.out.println(titleToNumber(excelLetter));
    }

    public static int titleToNumber(String excelLetter) {
        int result = 0;
        char charExcel;
        for (int i = 0; i < excelLetter.length(); i++) {
            charExcel = excelLetter.charAt(i); // i=0 A   i=1 A
                int asciiValue =  charExcel - 'A' + 1; // for A = 66 - 65 + 1
                result = result * 26 + asciiValue;  //AA icin (1*26)+1

        }
        return result;
    }
}
