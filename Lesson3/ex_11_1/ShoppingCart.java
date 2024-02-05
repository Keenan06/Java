/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_11_1;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author keenanpienaar
 */
public class ShoppingCart {

    public static void main(String[] args) {
        // Declare a LocalDateTime object, orderDate
        LocalDateTime orderDate;

        // Initialize the orderDate to the current date and time. Print it.
        orderDate = LocalDateTime.now();
        System.out.println("Order date is: " + orderDate);

        // Format orderDate using ISO_LOCAL_DATE; Print it.
        String isoDate = orderDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("ISO LOCAL DATE: " + isoDate);
    }
}
