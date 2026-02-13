package com.jsp;

import com.jsp.Config.Config;
import com.jsp.Subject.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Student student = context.getBean(Student.class);
        System.out.println(student);
        System.out.println(student.getSubject());
        System.out.println(student.getId());
        System.out.println(student.getName());

        System.out.println(student.getMobile());
        context.close();
        System.out.println();
    }
}
