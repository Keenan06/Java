/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4;

/**
 *
 * @author keenanpienaar
 */
public class VehicleDemo {
  public static void main(String args[]) {  
    Vehicle minivan = new Vehicle();  
    int range;  
  
    
    minivan.passengers = 7; 
    minivan.fuelcap = 16; 
    minivan.mpg = 21; 
  
    range = minivan.fuelcap * minivan.mpg; 
  
    System.out.println("Minivan can carry " + minivan.passengers + 
                       " with a range of " + range);  
  }  
}

