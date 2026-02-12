package com.jsp;

import com.jsp.Config.Config;
import com.jsp.Trainee.Trainee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Trainee trainee= context.getBean(Trainee.class);
        System.out.println(trainee.getId());
        System.out.println(trainee.getName());
        context.close();
        System.out.println("container closed");
    }
}
