/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex_10_3;

/**
 *
 * @author keenanpienaar
 */
public class Order {

    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }

    public String getDiscount() {
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
        // Replace the if logic with a switch statement.

//        if (custType == NONPROFIT) {
//            if (total > 900) {
//                discount = 10.00;
//            } else {
//                discount = 5.00;
//            }
//        } else if (custType == PRIVATE) {
//            if (total > 900) {
//                discount = 7.00;
//            } else {
//                discount = 0.00;
//            }
//        } else if (custType == CORP) {
//            if (total < 500) {
//                discount = 8.00;
//            } else {
//                discount = 5.00;
//            }
//        }  
        switch (custType) {
            case NONPROFIT:
                discount = (total > 900) ? 10.00 : 5.00;
                break;

            case PRIVATE:
                discount = (total > 900) ? 7.00 : 0.00;
                break;

            case CORP:
                discount = (total < 500) ? 8.00 : 5.00;
                break;

        }
    }

}
