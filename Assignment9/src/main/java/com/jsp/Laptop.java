package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Laptop {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Computer computer = (Computer) context.getBean("computer");
        System.out.println(computer.getCompany());
        System.out.println(computer.getMemory());
    }
}