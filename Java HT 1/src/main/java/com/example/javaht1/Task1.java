package com.example.javaht1;
import static java.lang.Math.pow;

public class Task1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(getStepin(a,b));
    }
    private static double getStepin (int a, int b) {
        return pow(a, b);
    }
}