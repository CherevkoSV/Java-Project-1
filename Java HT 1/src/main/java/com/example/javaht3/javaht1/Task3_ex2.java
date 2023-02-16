package com.example.javaht3.javaht1;

import java.util.Scanner;

public class Task3_ex2 {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int QUANTITY_BONUS_COUNT = 10;
    public static final double PERCENT_PER_BONUS = 0.4;

    public static void main(String[] args) {

        int quantity = getQuantity("Зазначте кількість товару: ");
        double price = getPrice("Зазначте ціну за одиницю товару: ");

        StringBuilder builder = new StringBuilder("Загальна інформація: ");

        appendPrice(builder, price);

        appendQuantity(builder, quantity);

        appendSum(builder, price, quantity);

        appendPercent(builder, price, quantity);

        System.out.println(builder);
    }

    private static double getSum(double price, int quantity) {
        double sumProcent = 100 - getPercent(price,quantity);

        return (price * quantity)/100d * sumProcent;
    }

    private static double getPercent(double price, int quantity) {
        if (quantity > 80) {
            return 13;
        }

        if (quantity > 30) {
            int additionalQuantity = quantity - 30;
            int bonusCount = additionalQuantity / QUANTITY_BONUS_COUNT;
            return 12 + bonusCount * PERCENT_PER_BONUS;
        }

        if (quantity > 20) {
            return 10;
        }

        if (quantity > 10) {
            return 5;
        }

        return 0;
    }

    private static int getQuantity(String title) {
        System.out.println(title);
        return SCANNER.nextInt();
    }

    private static double getPrice(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

    private static void appendPrice(StringBuilder builder, double price) {
        builder.append("\n"+"- ціна за одиницю товару: ");
        builder.append(price);
    }

    private static void appendQuantity(StringBuilder builder, int quantity) {
        builder.append("\n"+"- кількість товару: ");
        builder.append(quantity);
    }

    private static void appendSum(StringBuilder builder, double price, int quantity) {
        builder.append("\n"+"- загальна ціна: ");
        builder.append(getSum(price, quantity));
    }

    private static void appendPercent(StringBuilder builder, double price, int quantity) {
        builder.append("\n"+"- відсоток знижки: ");
        builder.append(getPercent(price, quantity));
    }
}