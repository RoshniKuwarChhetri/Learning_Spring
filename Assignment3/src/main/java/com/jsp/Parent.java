package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Parent {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Child child= (Child)context.getBean("child");
        System.out.println(child.getId());
        System.out.println(child.getName());
    }
}
