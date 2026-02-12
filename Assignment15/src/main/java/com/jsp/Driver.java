package com.jsp;

import com.jsp.College.College;
import com.jsp.Config.Config;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        College college =context.getBean(College.class);
        System.out.println(college.getId());
        System.out.println(college.getName());
        context.close();
        System.out.println("container closed");
    }
}
