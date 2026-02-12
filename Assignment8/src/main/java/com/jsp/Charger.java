package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Charger {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml" );
        Mobile calculator=(Mobile) context.getBean("mobile");
        System.out.println(calculator.getCompany());
        System.out.println(calculator.getMemory());
    }
}

