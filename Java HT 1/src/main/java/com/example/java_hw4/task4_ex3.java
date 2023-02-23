package com.example.java_hw4;
import java.util.Scanner;

public class task4_ex3 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        double creditSum = getCreditSum ("Загальна суму кредиту: ");
        double monthProcent = getMonthProcent ("Місячний відсоток на залишок по кредиту: ");


    }

    private static double getCreditSum(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

    private static double getMonthProcent(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

}
