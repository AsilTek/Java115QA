package d01JavayaGiris.A02.LowLevelOrIFelse;

public class kelimeBulma {

        public static void main(String[] args) {

            String str = "I hate JAVA";

            int firstSpaceIndex = str.indexOf(' ');
            int secondSpaceOfIndex = str.lastIndexOf(' ');
            String secondWord = str.substring(firstSpaceIndex,secondSpaceOfIndex);
            System.out.println(secondWord.trim());



    }


}