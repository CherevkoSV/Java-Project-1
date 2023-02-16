package com.example.javaht3.javaht1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Task3_ex3 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Map<Integer, Month> MONTH_DAYS = new HashMap();

    public static void main(String[] args) {
        MONTH_DAYS.put(1, new Month(31, "Січень"));
        MONTH_DAYS.put(2, new Month(28, "Лютий"));
        MONTH_DAYS.put(3, new Month(31, "Березень"));
        MONTH_DAYS.put(4, new Month(30, "Квітень"));
        MONTH_DAYS.put(5, new Month(31, "Травень"));
        MONTH_DAYS.put(6, new Month(30, "Червень"));
        MONTH_DAYS.put(7, new Month(31, "Липень"));
        MONTH_DAYS.put(8, new Month(31, "Серпень"));
        MONTH_DAYS.put(9, new Month(30, "Вересень"));
        MONTH_DAYS.put(10, new Month(31, "Жовтень"));
        MONTH_DAYS.put(11, new Month(30, "Листопад"));
        MONTH_DAYS.put(12, new Month(31, "Грудень"));

        int month = getMonth("Введіть номер місяця: ");

        double hourRate = getHourRate("Введіть вартість години: ");

        double procent = getProcent("Введіть відсоток податку: ");

        StringBuilder builder = new StringBuilder("Загальна інформація! ");

        countSalery(builder, month, hourRate, procent);

        System.out.println(builder);
    }

    private static void countSalery(StringBuilder builder, int monthNumber, double hourRate, double procent) {
        Month month = MONTH_DAYS.get(monthNumber);
        int workDays = (month.days - 2) - ((month.days - 2) / 7) * 2 - ((month.days - 2) % 7 == 6 ? 1 : 0);
        double saleryWithoutProcent = workDays * 8 * hourRate;
        double saleryWithProcent = saleryWithoutProcent - (saleryWithoutProcent / 100d * procent);

        builder.append("\n" + "За місяць " + month.name + ":");
        builder.append("\n" + "- з урахованням податку " + procent +"%" + " сума становить = " );
        builder.append(saleryWithProcent);
        builder.append("\n" + "- без податку" + " сума становить = " );
        builder.append(saleryWithoutProcent);
    }

    private static int getMonth(String title) {
        System.out.println(title);
        return SCANNER.nextInt();
    }

    private static double getHourRate(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

    private static double getProcent(String title) {
        System.out.println(title);
        return SCANNER.nextDouble();
    }

    private static class Month {
        private final int days;
        private final String name;

        public Month(int days, String name) {
            this.days = days;
            this.name = name;
        }
    }

}
