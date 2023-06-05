package com.example.java_hw10_staticFields;
import java.time.LocalDateTime;

public abstract class Product {
    protected LocalDateTime productionDateTime;
    protected int warrantyPeriod;

    //Constructor
    public Product(LocalDateTime productionDateTime, int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public Product(LocalDateTime productionDateTime) {
        this.productionDateTime = productionDateTime;
    }

    // Getters and Setters
    public LocalDateTime getProductionDateTime() {
        return productionDateTime;
    }

    public void setProductionDateTime(LocalDateTime productionDateTime) {
        this.productionDateTime = productionDateTime;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
}
