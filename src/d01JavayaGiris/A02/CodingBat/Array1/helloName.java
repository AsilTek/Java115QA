package d01JavayaGiris.A02.CodingBat.Array1;

/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
public class helloName {

    public static void main(String[] args) {

        System.out.println(helloName("Alice"));

    }

    public static String helloName(String name) {


        return "Hello "+name+"!";
    }
}
