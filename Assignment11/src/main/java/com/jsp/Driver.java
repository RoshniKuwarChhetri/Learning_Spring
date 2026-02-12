package com.jsp;

import com.jsp.Config.Config;
import com.jsp.Person.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getId());
        System.out.println(person.getName());

        System.out.println(person);
    }
}
