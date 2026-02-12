package com.jsp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.module.Configuration;

public class Driver {
    //ways of assigning values -1.fields 2.constructer 3.setter
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Person person= (Person) context.getBean("person");
        System.out.println(person.getId());
        System.out.println(person.getName());

        context.close();
        System.out.println("cointiner closed");


    }
}
