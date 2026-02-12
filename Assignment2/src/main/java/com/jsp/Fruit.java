package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Fruit {
    public static void main(String[] args) {

        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Apple apple=(Apple)context.getBean("apple");
        System.out.println(apple.getName());
        System.out.println(apple.getColor());
    }
}
