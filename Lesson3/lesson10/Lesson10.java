/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lesson10;

/**
 *
 * @author keenanpienaar
 */
public class Lesson10 {

    public static void main(String[] args) {
//        int i = 2;
//        int j = 8;
//        System.out.println((i < 1) && (j > 6));
//
//        System.out.println((i < 1) || (j > 10));
//
//        System.out.println(!(1 < 3));
//        int x = 2, y = 5, z = 0;
//        z = (y < x) ? x : y;
//        System.out.println(z);

//        int numGoals = 5;
//        System.out.println("number of " + ((numGoals > 1) ? "goals" : "goal" )+ " is " + numGoals);
        int month = 5;
        boolean isLeapYear = true;

//if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
//        month == 10 || month == 12){
//    System.out.println("31 days");
//}else if(month == 2){
//    if(!isLeapYear){
//        System.out.println("28 days");
//    }else{
//        System.out.println("29 days");
//    }
//}else if(month == 4 || month == 6 || month == 9 || month == 11){
//    System.out.println("30 days");
//} else{
//    System.out.println("invalid year");
//}
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 2:
                if (!isLeapYear) {
                    System.out.println("28 days");

                } else {
                    System.out.println("29 days");
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            default:
                System.out.println("invalid month");
                break;
        }

    }
}
