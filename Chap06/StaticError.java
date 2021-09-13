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
public class StaticError {
      int denom = 3; // a normal instance variable 
  static int val = 1024; // a static variable 
 
  /* Error! Can't access a non-static variable 
     from within a static method. */ 
  static int valDivDenom() { 
    return val/denom; // won't compile! 
  } 
}
