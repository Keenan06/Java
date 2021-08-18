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
public class Vehicle {
      int passengers;  
  int fuelcap;     
  int mpg;  

  void range() { 
    System.out.println("Range is " + fuelcap * mpg); 
  } 
    
       void myMeth() { 
  int i; 
 
  for(i=0; i<10; i++) { 
    if(i == 5) return; // stop at 5 
    System.out.println(); 
  } 
     }

      int range() { 
    return mpg * fuelcap; 
    
  } 
      double fuelneeded(int miles){
          return (double) miles / mpg;
      }
}  
  
 


