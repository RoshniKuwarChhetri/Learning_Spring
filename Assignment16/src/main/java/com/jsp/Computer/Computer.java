package com.jsp.Computer;

import org.springframework.stereotype.Component;

@Component
public class Computer {
    private int id;
    private String processer;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcesser() {
        return processer;
    }

    public void setProcesser(String processer) {
        this.processer = processer;
    }
}
