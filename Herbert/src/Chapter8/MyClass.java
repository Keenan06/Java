/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter8;

/**
 *
 * @author jaden
 */
public class MyClass implements B { 
  public void meth1() { 
    System.out.println("Implement meth1()."); 
  } 
 
  public void meth2() { 
    System.out.println("Implement meth2()."); 
  } 
 
  public void meth3() { 
    System.out.println("Implement meth3()."); 
  } 
} 
 
class IFExtend { 
  public static void main(String arg[]) { 
    MyClass ob = new MyClass(); 
 
    ob.meth1(); 
    ob.meth2(); 
    ob.meth3(); 
  } 
}
