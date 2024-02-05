/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author keenanpienaar
 */
public class Employee {

    public String name1 = "Fred Smith";
    public String name2 = "Ed Junior";

    public void areNamesEqual() {
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("same names");
        } else {
            System.out.println("different names");
        }
    }
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.areNamesEqual();
               
    }

}
