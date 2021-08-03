/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap1;

/**
 *
 * @author keenanpienaar
 */
public class Example3 {
  public static void main(String args[]) {
      int v;
      double x;
      
   v = 10;
   x = 10.0;
    System.out.println("Original value of v: " + v); 
    System.out.println("Original value of x: " + x); 
 
    System.out.println();
    
    v = v / 4;  
    x = x / 4; 
    
    System.out.println("v after division: " + v); 
    System.out.println("x after division: " + x); 
  }  
}
