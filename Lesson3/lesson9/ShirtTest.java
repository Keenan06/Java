/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author keenanpienaar
 */
public class ShirtTest {
    public static void main(String[] args) {
        Shirt theShirt = new Shirt('R',"Long shirt",5.99);
        
        theShirt.setColorCode('R');
        char colorCode = theShirt.getColorCode();
        System.out.println(colorCode);
        
        Shirt myShirt = new Shirt();
        System.out.println("colorcode of myShirt: "+myShirt.getColorCode());
        
//        theShirt.setColorCode('Z');
//        colorCode = theShirt.getColorCode();
//        System.out.println(colorCode);
        
    }
}
