package com.example.java_hw10_staticFields;
import java.time.LocalDateTime;

public class ProductFactory {
    private static int totalProducts = 0;
    private static int totalFoodProducts = 0;
    private static int totalNonFoodProducts = 0;

    public static FoodProduct createFoodProduct(LocalDateTime productionDateTime, int warrantyPeriod) {
        totalProducts++;
        totalFoodProducts++;
        return new FoodProduct(productionDateTime, warrantyPeriod);
    }

    public static NonFoodProduct createNonFoodProduct(LocalDateTime productionDateTime, int warrantyPeriod) {
        totalProducts++;
        totalNonFoodProducts++;
        return new NonFoodProduct(productionDateTime, warrantyPeriod);
    }

    public static void printProductStats() {
        System.out.println("Total products: " + totalProducts);
        System.out.println("Total food products: " + totalFoodProducts);
        System.out.println("Total non-food products: " + totalNonFoodProducts);
    }

    public static int getTotalProducts() {
        return totalProducts;
    }

    public static int getTotalFoodProducts() {
        return totalFoodProducts;
    }

    public static int getTotalNonFoodProducts() {
        return totalNonFoodProducts;
    }
}
