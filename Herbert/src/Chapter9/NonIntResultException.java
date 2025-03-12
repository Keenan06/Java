/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter9;

/**
 *
 * @author jaden
 */

// Use a custom exception. 
 
// Create an exception. 
class NonIntResultException extends Exception { 
  int n; 
  int d; 
 
  NonIntResultException(int i, int j) { 
    n = i; 
    d = j; 
  } 
 
  public String toString() { 
    return "Result of " + n + " / " + d + 
           " is non-integer."; 
  } 
}
