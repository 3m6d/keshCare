/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.keshcare.util;

/**
 *
 * @author dipawoli malla
 *
 * StringUtil class to encapsulate all error and informational messages.
 *
 */
public class StringUtil {

    public static final String ERROR_DUPLICATE_PRODUCT = "A product with the same brand name or number already exists.";
    public static final String ERROR_INVALID_PRICE = "Invalid price value. Please enter a valid price.";
    public static final String ERROR_INVALID_MANUFACTURER = "Invalid manufacturer details. Please enter valid information.";
    public static final String ERROR_INVALID_MANUFACTURED_YEAR = "Invalid manufactured year. Please enter a valid year.";
    public static final String ERROR_INVALID_QUANTITY = "Invalid quantity. Please enter a valid quantity.";
    public static final String ERROR_EMPTY_FIELDS = "One or more fields are empty. Please fill out all fields.";
    public static final String ERROR_NEGATIVE_VALUES = "Negative values are not allowed. Please enter positive values.";
    public static final String ERROR_SPECIAL_CHARACTERS = "Special characters are not allowed in this field.";
    public static final String ERROR_INVALID_STRING_VALUE = "Invalid string value. Please enter a valid string.";
    public static final String ERROR_INVALID_INTEGER_VALUE = "Invalid integer value. Please enter a valid integer.";
    public static final String ERROR_DUPLICATE_PRODUCT_NUMBER = "A product with the same product number already exists.";
    public static final String ERROR_DUPLICATE_BRAND_NAME = "A product with the same brand name already exists. Please input valid name";
    public static final String ERROR_INVALID_INPUT_FORMAT = "Invalid input format. Please check your data.";
    public static final String ERROR_FILL_ALL_FIELDS = "Please fill in all fields with valid information.";
    public static final String ERROR_INVALID_BRAND_NAME_FORMAT = "Brand Name must contain only letters. The first letter of Brand Name must be capital.";
    public static final String ERROR_INVALID_KEY_INGREDIENTS_FORMAT = "Key Ingredients cannot contain numbers.";
    public static final String ERROR_INVALID_MANUFACTURER_FORMAT = "Manufacturer must contain only letters.";
    public static final String ERROR_SELECT_ROW_TO_UPDATE = "Please select a row to update.";
    public static final String ERROR_EMPTY_PRODUCT_NUMBER = "Please fill all the fields. Product number cannot be empty.";
    public static final String ERROR_EMPTY_BRAND_NAME = "Brand name cannot be empty.";
    public static final String ERROR_EMPTY_KEY_INGREDIENT = "Key ingredient cannot be empty.";
    public static final String ERROR_EMPTY_CATEGORY = "Category cannot be empty.";
    public static final String ERROR_EMPTY_PRICE = "Price cannot be empty.";
    public static final String ERROR_EMPTY_QUANTITY = "Quantity cannot be empty.";
    public static final String ERROR_EMPTY_MANUFACTURER = "Manufacturer cannot be empty.";
    public static final String ERROR_EMPTY_MANUFACTURED_DATE = "Manufactured date cannot be empty.";
    public static final String ERROR_INVALID_PRODUCT_NUMBER = "Product number cannot be -1.";
    public static final String ERROR_INVALID_PRODUCT_NUMBER_ZERO = "Product number must be greater than zero.";
    public static final String ERROR_INVALID_PRICE_NEGATIVE = "Price must be a positive number.";
    public static final String ERROR_INVALID_QUANTITY_NEGATIVE = "Please keep the quantity as a positive number.";
    public static final String ERROR_INVALID_MANUFACTURED_DATE = "Manufactured date must be a year between 1900 and current year.";
    public static final String ERROR_PRODUCT_NUMBER_EXISTS = "A product with the same product number already exists.";
    public static final String ERROR_NUMBER_FORMAT_EXCEPTION = "Product Number, Price, Quantity and Manufactured Year must contain valid numbers.";
    public static final String ERROR_UNEXPECTED = "An unexpected error occurred: ";
    public static final String SUCCESS_PRODUCT_UPDATED = "Product updated successfully.";
    // Private constructor to prevent instantiation

    // Informational Messages
    public static final String INFO_PRODUCT_ADDED_SUCCESSFULLY = "Product added successfully.";
    public static final String INFO_PRODUCT_UPDATED_SUCCESSFULLY = "Product updated successfully.";
    public static final String INFO_PRODUCT_DELETED_SUCCESSFULLY = "Product deleted successfully.";

    // Private constructor to prevent instantiation
    private StringUtil() {
        // This constructor is intentionally empty. Nothing special is needed here.
    }
}
