package com.example.java_hw10_staticFields;
import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int numFoodProducts = random.nextInt(100) + 1;
        int numNonFoodProducts = random.nextInt(100) + 1;

        for (int i = 0; i < numFoodProducts; i++) {
            FoodProduct foodProduct1 = new FoodProduct(LocalDateTime.now(), 30);
        }
        for (int i = 0; i < numNonFoodProducts; i++) {
            NonFoodProduct nonFoodProduct1 = new NonFoodProduct(LocalDateTime.now(), 365);
        }
        for (int i = 0; i < numFoodProducts; i++) {
            FoodProduct foodProduct2 = ProductFactory.createFoodProduct(LocalDateTime.now(), 10);
        }
        for (int i = 0; i < numNonFoodProducts; i++) {
            NonFoodProduct nonFoodProduct2 = ProductFactory.createNonFoodProduct(LocalDateTime.now(), 180);
        }

        System.out.println("Фабрика виготовила " + ProductFactory.getTotalFoodProducts() + " продуктових товарів");
        System.out.println("Фабрика виготовила " + ProductFactory.getTotalNonFoodProducts() + " непродуктових товарів");
        System.out.println("Загалом створено, " + (ProductFactory.getTotalFoodProducts() + numFoodProducts) + " продуктових товарів");
        System.out.println("Загалом створено, " + (ProductFactory.getTotalNonFoodProducts() + numNonFoodProducts) + " непродуктових товарів");
    }
}
