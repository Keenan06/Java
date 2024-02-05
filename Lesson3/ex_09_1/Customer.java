/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_09_1;

/**
 *
 * @author keenanpienaar
 */
public class Customer {
    public String name;
    public String ssn;
   
    
    
    // Encapsulate this class.  Make ssn read only.
    
    public String getName(){
        return name;
        
    }
    public void setName(String name){
        this.name = name;
    }
    
    public String getSsn(){
        return name;
    }
           
}
