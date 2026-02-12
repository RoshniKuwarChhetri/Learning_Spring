package com.jsp.Phone;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String Brand;
    private String Processer;

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setProcesser(String processer) {
        Processer = processer;
    }

    public String getBrand() {
        return Brand;
    }

    public String getProcesser() {
        return Processer;
    }
}
