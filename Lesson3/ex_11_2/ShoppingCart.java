/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_11_2;

/**
 *
 * @author keenanpienaar
 */
public class ShoppingCart {
     public static void main(String[] args) {
        String name;
        int age;

        // Parse the args array to populate name and age. 
        name = args[0];
        age = Integer.parseInt(args[1]);
         System.out.println("Name is " + name + " age is " + age);
	// Print an error message if fewer than 2 args are passed in.
        
        if (args.length < 2){
            System.out.println("2 arguments are required!");
        }
        
        
    }
}
