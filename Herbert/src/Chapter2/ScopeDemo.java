/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter2;

/**
 *
 * @author jaden
 */
public class ScopeDemo {
    public static void main(String[] args) {
        int x;
        
        x = 10;
        if(x == 10){
            int y = 20;
            
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
          // y = 100;
        
        System.out.println("x is " + x);
    }
}
