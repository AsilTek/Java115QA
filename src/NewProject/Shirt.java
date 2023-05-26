package NewProject;

public class Shirt {

    String color;
    int size;


    Shirt(String color, int size){
        this.color=color;
        this.size = size;
    }


    Shirt doubleSize (Shirt shirt){

        Shirt newShirt = new Shirt("red", shirt.size*2);
        return newShirt;
    }



}
