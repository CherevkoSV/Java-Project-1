package com.example.java_hw4;

import java.util.Scanner;

public class task4_ex1 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            int type = getType
                    ("Введіть номер фігури, яку хочете вивести на екран: " +
                            "\n 1 - прямокутник; " +
                            "\n 2 - прямокутний трикутник; " +
                            "\n 3 - зворотній прямокутний трикутник; " +
                            "\n 4 - трикутник;");

            if (type == 1) {
                int width = getWidth("Введіть ширину: ");
                int height = getHeight("Введіть висоту: ");
                printRectangle(width, height);
            }

            if (type == 2) {
                int height = getHeight("Введіть висоту: ");
                printRightTriangle(height);
            }

            if (type == 3) {
                int height = getHeight("Введіть висоту: ");
                printReRightTriangle(height);
            }

            if (type == 4) {
                int height = getHeight("Введіть висоту: ");
                printTriangle(height);
            }

            System.out.println("\n" + "Хочете продовжити введіть - yes / хочете завершити - no");
            String isContinue = SCANNER.next();
            if (isContinue.equals("no")) {
                isRun = false;
                if (isContinue.equals("yes")) {
                    isRun = true;
                }
            }
        }
    }

    private static void printRectangle(int width, int height) {
        String row = "";
        for (int i = 1; i <= width; i++) {
            row = row + "*";
        }
        for (int i = 1; i <= height; i++) {
            System.out.println(row);
        }
    }

    private static void printRightTriangle(int height) {
        String row = "";
        for (int i = 1; i <= height; i++) {
            row = row + "*";
            System.out.println(row);
        }
    }

    private static void printReRightTriangle(int height) {
        String row = "";
        for (int i = 1; i <= height; i++) {
            row = row + "*";
            String whiteSpaces = "";
            for (int h = 1; h <= height - i; h++) {
                whiteSpaces = whiteSpaces + " ";
            }
            System.out.println(whiteSpaces + row);
        }
    }

    private static void printTriangle(int height) {
        for (int i = 1; i <= height * 2; i = i + 2) {
            String row = "";
            for (int j = 0; j < i; j++) {
                row = row + "*";
            }
            String whiteSpaces = "";
            for (int h = 1; h <= (height * 2 - i) / 2; h++) {
                whiteSpaces = whiteSpaces + " ";
            }
            System.out.println(whiteSpaces + row + whiteSpaces);
        }
    }

    private static int getType(String title) {
        System.out.println(title);
        return SCANNER.nextInt();
    }

    private static int getWidth(String title) {
        System.out.println(title);
        return SCANNER.nextInt();
    }

    private static int getHeight(String title) {
        System.out.println(title);
        return SCANNER.nextInt();
    }
}