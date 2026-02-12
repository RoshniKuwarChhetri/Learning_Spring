package com.jsp;

import com.jsp.Config.Config;
import com.jsp.School.School;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        School school = context.getBean(School.class);
        System.out.println(school.getId());
        System.out.println(school.getName());
        context.close();
        System.out.println("context closed");
    }
}
