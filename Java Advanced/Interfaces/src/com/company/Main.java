package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123469);
        timsPhone.powerOn();
        timsPhone.callPhone(123469);
        timsPhone.answer();

        timsPhone = new MobilePhone(691234);
        timsPhone.powerOn();
        timsPhone.callPhone(691234);
        timsPhone.answer();
    }
}