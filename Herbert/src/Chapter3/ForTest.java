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

// Loop until an S is typed. 

class ForTest {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    int i; 
 
    System.out.println("Press S to stop."); 
 
    for(i = 0; (char) System.in.read() != 'S'; i++) 
      System.out.println("Pass #" + i); 
  }   
}
