package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Internet {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Laptop laptop=(Laptop) context.getBean("laptop");
        System.out.println(laptop.getBrand());
        System.out.println(laptop.getPrice());
    }
}
