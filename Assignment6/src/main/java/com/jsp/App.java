package com.jsp;

public class App {
    private String type;
    private boolean is_paid;

    public void setType(String type) {
        this.type = type;
    }

    public void setIs_paid(boolean is_paid) {
        this.is_paid = is_paid;
    }

    public boolean isIs_paid() {
        return is_paid;
    }

    public String getType() {
        return type;
    }

    public App(String type, boolean is_paid) {
        this.type = type;
        this.is_paid = is_paid;
    }
}
