package ex_13_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ShoppingCart {
    public static void main(String[] args){
        String[] days = {"monday","saturday","tuesday","sunday","friday"};

        // Convert the days array into an ArrayList

        List<String> mylist = Arrays.asList(days);
        ArrayList<String> myArr = new ArrayList<>(mylist);

        // Loop through the ArrayList, printing out "sunday" elements in
        //   upper case (use toUpperCase() method of String class)
        for(String element : myArr){
            if (element.equals("sunday")){
                System.out.println(element.toUpperCase());
            }else{
                System.out.println(element);
            }

        }

        System.out.println(myArr);
        // Print all other days in lower case
        // Print out the ArrayList



    }
}
