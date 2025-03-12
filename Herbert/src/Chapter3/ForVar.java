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

// Declare loop control variable inside the for. 

class ForVar {   
  public static void main(String args[]) { 
    int sum = 0; 
    int fact = 1; 
   
    for(int i = 1; i <= 5; i++) {  
      sum += i;  // i is known throughout the loop 
      fact *= i; 
    } 
 
    // i is not known here
 
    System.out.println("Sum is " + sum); 
    System.out.println("Factorial is " + fact); 
  }   
}
