package NewProject;

public class Main2 {

    public static void main(String[] args) {

        Shirt myshirt = new Shirt("red", 5);
        myshirt= myshirt.doubleSize(myshirt);

        System.out.println(myshirt.size);



    }
}
