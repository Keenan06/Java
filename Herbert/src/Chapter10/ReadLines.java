/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter10;

/**
 *
 * @author jaden
 */

// Read a string from console using a BufferedReader. 

import java.io.*; 
 
class ReadLines { 
  public static void main(String args[])  
    throws IOException 
  { 
    // create a BufferedReader using System.in 
    BufferedReader br = new BufferedReader(new 
                            InputStreamReader(System.in)); 
    String str; 
 
    System.out.println("Enter lines of text."); 
    System.out.println("Enter 'stop' to quit."); 
    do { 
      str = br.readLine(); 
      System.out.println(str); 
    } while(!str.equals("stop")); 
  } 
}
