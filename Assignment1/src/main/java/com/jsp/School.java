package com.jsp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class School {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Teacher teacher=(Teacher) context.getBean("teacher");
        System.out.println(teacher.getName());
        System.out.println(teacher.getId());

    }
}
