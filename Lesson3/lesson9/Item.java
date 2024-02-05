/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson9;

/**
 *
 * @author keenanpienaar
 */
public class Item {
   private int id;
   private String desc;
   private static int nextId = 1;
    private double price = 10.00;
    
    public Item(){
        
        setId();
        desc = "--description required--";
        price = 10.00;
        
    }
    
    private void setId(){
        id = Item.nextId++;
        System.out.println(" NEXT ID " + id);
    }
    
    public void setPrice(Customer cust){
        if (cust.hasLoyaltyDiscount){
            price = price *85;
            
        }
        System.out.println("price of item is " + price);
    }
}
