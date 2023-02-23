package com.example.java_hw2;

public class Task2 {
    public static final int WEEK_IN_MONTH = 4;
    public static final int MONTH_IN_YEAR = 12;
    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);
        int money = Integer.parseInt(args[1]);
        double procent = Double.parseDouble(args[2]);

        System.out.println("Зарплатня на місяць без податків: " + getSaleryMonth(hours, money));
        System.out.println("Зарплатня на місяць з податками: " + getSaleryMonthP(hours, money, procent));
        System.out.println("Зарплатня на рік без податків: " + getSaleryYear(hours, money));
        System.out.println("Зарплатня на рік з податками: " + getSaleryYearP(hours, money, procent));
    }
    private static double getSaleryMonth(int hours, int money) {
        return hours * WEEK_IN_MONTH * money;
    }
    private static double getSaleryMonthP(int hours, int money, double procent) {
        int saleryMonthP = hours * WEEK_IN_MONTH * money;
        return saleryMonthP - getProcent(saleryMonthP, procent);
    }
    private static double getSaleryYear(int hours, int money) {
        return hours* WEEK_IN_MONTH * MONTH_IN_YEAR * money;
    }
    private static double getSaleryYearP(int hours, int money, double procent) {
        int saleryYearP = hours * WEEK_IN_MONTH * MONTH_IN_YEAR * money;
        return saleryYearP - getProcent(saleryYearP, procent);
    }

    private static double getProcent(double numb, double procent) {
        return numb / 100 * procent;
    }

}