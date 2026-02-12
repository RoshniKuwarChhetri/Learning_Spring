package com.jsp;

public class Calculator {
    private String brand;
    private int price;

    public Calculator(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
