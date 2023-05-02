package d01JavayaGiris.A02.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExp {
    /*List can not get primitive data type. it uses wrapper class.
    List is an interface not a class.

     */
    public static void main(String[] args) {

//ADD:how to create list
        List<Integer> numbers = new ArrayList<>();
//to add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(2,30);

//ADD: adding elements from one list to another new created list
       List<Integer> list = new ArrayList<>(numbers);
        System.out.println(list); //[10, 20, 30]
//or you can use addAll
        List<Integer> newNumb = new ArrayList<>();
        newNumb.addAll(numbers);
        System.out.println(newNumb);
 //REMOVE: removing  Integer element/elements from the list
        list.remove(0);
        System.out.println(list); //[20, 30]
// removing String or Character element/elements from the list

        List<String> str = new ArrayList<>();
        str.add("Asil");
        str.add("Arda");
        str.add(2,"Yagiz");

        str.remove("Yagiz");
        System.out.println(str ); //[Asil, Arda]
// CONTAINS: contains with list. we will see on an example of get rid of repeated numbers from an array.
        int[] arr = {1, 2, 3, 4, 7, 3, 8 ,4 , 10, 16, 7};
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i <arr.length; i++) {
            if(!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }
        System.out.println(uniqueList); //[1, 2, 3, 4, 7, 8, 10, 16]


// SIZE: to see length of a list :
        System.out.println(uniqueList.size());//8

/* GET: We were calling an element from the array by its arr[index];  but
        for the List we call it with get() */
        System.out.println(uniqueList.get(0)); //1

//SET: set is for updating elements of a list. // changing 1st index by 10.
        uniqueList.set(0,10);
        System.out.println(uniqueList);
//SUBLIST = substring in array. Starting index to destination index but not included.
        System.out.println(uniqueList); //[10, 2, 3, 4, 7, 8, 10, 16]
        System.out.println(uniqueList.subList(1, 5)); //[2, 3, 4, 7]

// indexOf usage for the list
        System.out.println(str); //[Asil, Arda]
        System.out.println(str.indexOf("Asil")); // 0
    }
}
