/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.keshcare.model;

/**
 * Represents a product with various properties
 * like product number, brand name, key ingredients, category,
 * price, quality, manufacturer and manufactured year.
 * Provides getter and setter methods for manipulating these properties.
 * Author: Dipawoli Malla
 */

public class Product {
    
    private int productNum;
    private String brandName;
    private String keyIngredient;
    private String category;
    private double price;
    private int quantity;
    private String manufacturer;
    private int mfdDate;

    // Constructor
    public Product(int productNum, String brandName, String keyIngredient,
            String category, double price, int quantity,
            String manufacturer, int mfdDate) {
        this.productNum = productNum;
        this.brandName = brandName;
        this.keyIngredient = keyIngredient;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.mfdDate = mfdDate;

    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getKeyIngredient() {
        return keyIngredient;
    }

    public void setKeyIngredient(String keyIngredient) {
        this.keyIngredient = keyIngredient;
    }

 
    public void setCategory(String category) {
        this.category = category;
    }
    
      public String getCategory() {
        switch (category) {
            case "Hair Oil", "Serum", "Shampoo" -> {
            }
        }
        return category;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getMfdDate() {
        return mfdDate;
    }

    public void setMfdDate(int mfdDate) {
        this.mfdDate = mfdDate;
    }
}

 

