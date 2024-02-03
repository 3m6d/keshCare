/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.keshcare.controller;

import com.keshcare.model.Product;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author dipawoli
 */
public class Controller {

    private ArrayList<Product> productList;

    public Controller(ArrayList<Product> productList) {
        this.productList = productList;
    }

    /**
     * Sorts an ArrayList of Product objects in ascending order by product
     * number using bubble sort.
     *
     * @param productList The ArrayList of Product objects to sort.
     */
    public void sortByProductNum(ArrayList<Product> productList) {
        int n = productList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (productList.get(j).getProductNum() > productList.get(j + 1).getProductNum()) {
                    // swap temp and productList.get(j)
                    Product temp = productList.get(j);
                    productList.set(j, productList.get(j + 1));
                    productList.set(j + 1, temp);
                }
            }
        }
    }

    /**
     * Sorts an ArrayList of Product objects in ascending order by brand name
     * using bubble sort.
     *
     * @param productList The ArrayList of Product objects to sort.
     */
    public void sortByBrandName(ArrayList<Product> productList) {
        int n = productList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (productList.get(j).getBrandName().compareTo
        (productList.get(j + 1).getBrandName()) > 0) {
                    // swap temp and productList.get(j)
                    Product temp = productList.get(j);
                    productList.set(j, productList.get(j + 1));
                    productList.set(j + 1, temp);
                }
            }
        }
    }

    /**
     * Sorts an ArrayList of Product objects in descending order by price using
     * bubble sort.
     *
     * @param productList The ArrayList of Product objects to sort.
     */
    public void sortByPriceRange(ArrayList<Product> productList) {
        int n = productList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (productList.get(j).getPrice() < productList.get(j + 1).getPrice()) {
                    // swap temp and productList.get(j)
                    Product temp = productList.get(j);
                    productList.set(j, productList.get(j + 1));
                    productList.set(j + 1, temp);
                }
            }
        }
    }

    /* public void sortByCategory(ArrayList<Product> productList, String sortBy) {
        int n = productList.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                int comparisonResult;
                switch (sortBy) {
                    case "Sort By Hair Oil":
                        

                    case "Sort By Serum":

                    case "Sort By Shampoo":
                        comparisonResult = productList.get(j).getCategory().compareTo(productList.get(j + 1).getCategory());
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid sortBy value");
                }

                if (comparisonResult > 0) {
                    // swap productList[j+1] and productList[j]
                    Product temp = productList.get(j);
                    productList.set(j, productList.get(j + 1));
                    productList.set(j + 1, temp);
                }
            }
        }
    }*/
    /**
     * Sorts an ArrayList of Product objects based on a specific category.
     * Products of the specified category are moved to the front of the list,
     * and the remaining products are sorted in ascending order by category.
     *
     * @param productList The ArrayList of Product objects to sort.
     * @param sortBy The category to sort by.
     */
    public void sortByCategory(ArrayList<Product> productList, String sortBy) {
    int n = productList.size();
    for (int i = 0; i < n-1; i++) {
        for (int j = 0; j < n-i-1; j++) {
            Product p1 = productList.get(j);
            Product p2 = productList.get(j+1);
            if ((p1.getCategory().equals(sortBy) && !p2.getCategory().equals(sortBy)) ||
                (!p1.getCategory().equals(sortBy) && p2.getCategory().equals(sortBy) && p1.getCategory().compareTo(p2.getCategory()) > 0)) {
                // swap p1 and p2
                productList.set(j, p2);
                productList.set(j+1, p1);
            }
        }
    }
}

    /**
     * Performs a binary search on a List of Product objects to find a product
     * with a specific brand name. The list must be sorted in ascending order by
     * brand name for the binary search to work correctly.
     *
     * @param products The List of Product objects to search.
     * @param brandName The brand name to search for.
     * @return The Product object with the specified brand name, or null if no
     * such product is found.
     */
    public Product binarySearchByBrandName(List<Product> products, String brandName) {

        int low = 0;
        int high = products.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            Product midProduct = products.get(mid);

            int result = midProduct.getBrandName().compareToIgnoreCase(brandName);

            // Check if brandName is present at mid
            if (result == 0) {
                return midProduct;
            }

            // If brandName is greater, ignore left half
            if (result < 0) {
                low = mid + 1;
            } // If brandName is smaller, ignore right half
            else {
                high = mid - 1;
            }
        }

        return null; // brandName not present
    }

}
