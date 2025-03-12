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

// Read input until a q is received. 

class Break2 {   
  public static void main(String args[])   
    throws java.io.IOException { 
 
    char ch; 
 
    for( ; ; ) { 
      ch = (char) System.in.read(); // get char 
      if(ch == 'q') break; 
    } 
    System.out.println("You pressed q!"); 
  }   
}
