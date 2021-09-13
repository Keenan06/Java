/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06;

/**
 *
 * @author keenanpienaar
 */
public class NestedClassDemo {
      public static void main(String args[]) {  
    int x[] = { 3, 2, 1, 5, 6, 9, 7, 8 }; 
    Outer outOb = new Outer(x);  
 
    outOb.analyze(); 
  }  
}
