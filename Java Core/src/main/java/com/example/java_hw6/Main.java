package com.example.java_hw6;

public class Main {
    public Credit credit;

    public static void main(String[] args) {
        Credit credit =  new Credit(10, 20, 10);
        System.out.println(credit.getMonthlyPayment());
    }
}
