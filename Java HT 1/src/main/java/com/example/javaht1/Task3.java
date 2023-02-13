package com.example.javaht1;
import java.util.Scanner;

public class Task3 {
    public static final int WEEK_IN_MONTH = 4;
    public static final int MONTH_IN_YEAR = 12;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kількість робочих годин на тиждень: ");
        int hourOnWeek = sc.nextInt();
        System.out.println("Pічна зарплатня з податками: ");
        int saleryWithP = sc.nextInt();
        System.out.println("Bісоток податку: ");
        double procentP = sc.nextDouble();

        System.out.println(
                String.format(
                        "При %s робочих годин на тиждень з річною зарплатею в %s та податком %s година часу коштує %s",
                        hourOnWeek,
                        saleryWithP,
                        procentP,
                        hourWithoutP(hourOnWeek, saleryWithP, procentP)
                )
        );
    }
    private static double hourWithoutP(double hourOnWeek, double saleryWithP, double procentP){
        return (saleryWithP - (saleryWithP/ 100 * procentP)) / MONTH_IN_YEAR /WEEK_IN_MONTH / hourOnWeek;
    }

}