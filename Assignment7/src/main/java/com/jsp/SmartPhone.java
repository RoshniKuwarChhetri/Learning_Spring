package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SmartPhone {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml" );
        Calculator calculator=(Calculator) context.getBean("calculator");
        System.out.println(calculator.getPrice());
        System.out.println(calculator.getBrand());
    }
}
