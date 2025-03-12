/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author jaden
 */
public class NoBreak {
    public static void main(String args[]) { 
    int i; 
 
    for(i=0; i<=5; i++) { 
      switch(i) { 
        case 0:  
          System.out.println("i is less than one"); 
        case 1:  
          System.out.println("i is less than two"); 
        case 2:  
          System.out.println("i is less than three"); 
        case 3:  
          System.out.println("i is less than four"); 
        case 4:  
          System.out.println("i is less than five"); 
      } 
      System.out.println(); 
    } 
  }
}
