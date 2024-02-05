/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_10_3;

/**
 *
 * @author keenanpienaar
 */
public class ShoppingCart {
    public static void main(String args[]){
        Order order = new Order("Rick Wilson", 200.00, "VA", Order.CORP);
        System.out.println("Discount is: "+ order.getDiscount());
    }
}
