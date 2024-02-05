/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson11;

//import java.time.LocalDateTime;
//import java.time.chrono.JapaneseDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.FormatStyle;

import java.util.ArrayList;

/**
 * @author keenanpienaar
 */
public class Lesson11 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Jamie");
        names.add("Alexis");
        names.add("Janice");
        names.add(2, "Shanice");

        names.remove(2);
        names.remove(names.size() - 1);
        names.remove("Alexis");

        System.out.println(names);

//        int[][] sales = new int[3][4];
//        initArray(sales);
//        for (int y = 0; y < 3; y++) {
//            System.out.println("Year " + (y + 1));
//            for (int x = 0; x < 4; x++) {
//                System.out.print("\tQ: " + (x + 1) + " " + (sales[y][x]));
//
//            }
//            System.out.println();
//        }
//
//
//    }
//            static int[][] initArray(int[][] sales){
//                for (int y = 0; y < 3; y++ ){
//                    for (int x = 0; x < 4; x++){
//                        sales[y][x] = (int)Math.floor(Math.random() * 20000);
//
//                    }
//                }
//                return sales;
//            }
//    static void factorial(int target){
//
//        int save = target;
//        int fact = 1;
//        do{
//            fact *= target--;
//        }while(target > 0);
//        System.out.println("The factorial for "+ save + " is " + fact);
    }
}

