package com.qsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Table {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Chair chair=(Chair) context.getBean("chair");
        System.out.println(chair.getMaterial_used());
        System.out.println(chair.isIs_water_proof());
    }
}
