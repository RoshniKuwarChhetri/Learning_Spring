package com.jsp;

import com.jsp.Config.Config;
import com.jsp.Laptop.Laptop;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Laptop laptop= context.getBean(Laptop.class);
        System.out.println(laptop.getBrand());
        System.out.println(laptop.getPrice());
        System.out.println(laptop);

        context.close();

    }
}
