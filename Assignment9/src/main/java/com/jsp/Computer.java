package com.jsp;

public class Computer {

    private String company;
    private String memory;

    public Computer(String memory, String company) {
        this.memory = memory;
        this.company = company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getCompany() {
        return company;
    }

    public String getMemory() {
        return memory;
    }
}

