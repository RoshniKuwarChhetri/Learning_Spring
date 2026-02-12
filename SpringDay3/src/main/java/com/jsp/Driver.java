package com.jsp;

import com.qsp.Person;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Driver {

    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Person person =(Person) context.getBean("person");

        person.setId(121);
        person.setName("Roshni");
        System.out.println(person.getName());
        System.out.println(person.getId());

        context.close();
        System.out.println("container closed");
    }
}
