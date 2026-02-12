package com.qsp.Student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

public class Student {

    //DI--setter
    //setter dep inj
//    @Value(value = "101")

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Student(@Value(value="${name}") String name, @Value(value="${id}") int id) {
        this.name = name;
        this.id = id;
    }
    //setter dep injection
//    @Value(value="Roshni")
    public void setName(String name) {
        this.name = name;

    }
}
