package com.jsp;

import com.jsp.Computer.Computer;
import com.jsp.Config.Config;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {


        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Computer computer = context.getBean(Computer.class);
        System.out.println(computer.getId());
        System.out.println(computer.getProcesser());
        System.out.println(computer);
        context.close();
        System.out.println("container closed");

    }
}
