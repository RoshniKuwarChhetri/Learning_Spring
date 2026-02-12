package com.jsp.Person;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private int id;
    private  String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
