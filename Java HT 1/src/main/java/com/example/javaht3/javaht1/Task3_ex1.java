package com.example.javaht3.javaht1;

import java.util.Scanner;

public class Task3_ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть число: ");
        double number = sc.nextDouble();
        boolean isPrime = true;
        StringBuilder builder = new StringBuilder("Інформація про число " + number + ": ");

        if (number == 0 ) {
            builder.append("\n"+"- відсутня.");
            System.out.println(builder);
            return;
        }

        if (((int) number) % 2 == 0) {
            builder.append("\n"+"- парне;");
        } else {
            builder.append("\n"+"- не парне;");
        }

        if (number > 0) {
            builder.append("\n"+"- позитивне;");
        } else {
            builder.append("\n"+"- негативне;");
        }

        for (int eachNumber = 2; eachNumber < number; eachNumber++) {
            if (number % eachNumber == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            builder.append("\n"+"- просте.");
        } else {
            builder.append("\n"+"- складне.");
        }
        System.out.println(builder);
    }

}