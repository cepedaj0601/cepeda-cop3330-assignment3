package assignment3.base;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Scanner;

//contains functions used to find the product
public class Product_2 {
    @JsonProperty ("name")
    private String name;

    @JsonProperty ("price")
    private double price;

    @JsonProperty("quantity")
    private int quantity;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
