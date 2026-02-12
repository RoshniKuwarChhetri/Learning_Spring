package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Download {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        App app =(App)context.getBean("app");
        System.out.println(app.getType());
        System.out.println(app.isIs_paid());
    }
}
