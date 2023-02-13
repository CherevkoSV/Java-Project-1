package com.example.javaht1;

import static java.lang.Math.pow;

public class HelloApplication {


    public static void main(String[] args) {
        //System.out.printf("shash\n");
        System.out.printf(getHardCodeName()); // Name 1
        System.out.println(getName ("Cherevko\n")); // Name 2
        System.out.println(getStepin(3,4));
        double selary = 5d*3d/4d;
        System.out.println("the salery is: " + selary);
    }
    static String getHardCodeName (){
        return "Serhii CH\n";
    }
    static String getName (String name){
        return name;
    }
    private static double getStepin (int a, Integer b){
        System.out.println(b.hashCode());
        return pow(a, b);
    }
}