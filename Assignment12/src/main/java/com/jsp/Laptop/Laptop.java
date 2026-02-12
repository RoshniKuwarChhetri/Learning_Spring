package com.jsp.Laptop;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private String Brand;
    private int Price;

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public int getPrice() {
        return Price;
    }
}
