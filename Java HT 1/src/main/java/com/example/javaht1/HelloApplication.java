package com.example.javaht1;

import static java.lang.Math.pow;

public class HelloApplication {


    public static void main(String[] args) {
        //System.out.printf("shash\n");
        System.out.printf(getHardCodeName());
        System.out.println(getName ("Cherevko\n"));
        System.out.println(getStepin(3,4));
    }
    private static String getHardCodeName (){
        return "Serhii CH\n";
    }

    private static String getName (String name){
        return name;
    }
    private static double getStepin (int a, Integer b){
        System.out.println(b.hashCode());

        return pow(a, b);
    }
}