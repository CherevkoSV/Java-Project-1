package com.example.java_hw6;

public class Product {
    private String name;
    private String article;
    private Double price;
    private String description;
    private Boolean available;

    public String getName() {
        return name;
    }

    public String getArticle() {
        return article;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public Product(String name, String article, Double price, Boolean available) {
        this.name = name;
        this.article = article;
        this.price = price;
        this.available = available;
    }
}
