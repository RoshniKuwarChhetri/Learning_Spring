package com.qsp;

import com.qsp.Config.Config;
import com.qsp.Student.Student;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Student student= context.getBean(Student.class);
        Student student2= context.getBean(Student.class);
        Student student3= context.getBean(Student.class);
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println(student.getId());
        System.out.println(student.getName());

        //in singleton one object will (returned reference will be same).
        //in prototype different objects will be created for each (different reference will be returned).
        //bean can't work with constructer it is method level
        //using property file(--id=101(no "" or;)) use @PropertySource(value = "app.properties") annotation in config
        //@Value -- primitive & string.
        //@Autowire--for non primitive.
    }
}
