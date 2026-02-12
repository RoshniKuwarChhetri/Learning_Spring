package com.jsp;

import com.jsp.Config.Config;
import com.jsp.Teacher.Teacher;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        Teacher teacher = context.getBean(Teacher.class);
        System.out.println(teacher.getId());
        System.out.println(teacher.getName());
        context.close();
        System.out.println("Container closed");
    }
}
