package Lesson12;

import lesson13.Trousers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
//Shirt shirt01 = new Shirt(20.00,'M');
//Shirt shit02 = new Shirt(1123, "Loose Tee",'C',200.00);
//shit02.setColorCode('C');
//Clothing c1  = new Shirt(1123, "Loose Tee",'C',200.00);
//c1.display();
//c1.setColorCode('P');
//        Clothing c1 = new Trousers();
//        Trousers t1 = new Trousers();
//        Returnable r1 = new Trousers();
//        r1.getFit();
//        if (r1 instanceof Trousers){
//            ((Trousers)r1).getFit();
//        }
        String[] names = {"Ned", "Fred", "Jess", "Alice", " Rick"};
        List<String> myList = new ArrayList(Arrays.asList(names));

        for (String s : myList){
            System.out.println(s.toUpperCase() + ", ");
        }
        System.out.println("After loop: " + myList);

    }
}
