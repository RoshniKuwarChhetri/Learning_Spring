package com.jsp;

import com.jsp.Config.Config;
import com.jsp.Employee.Employee;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee.getId());
        System.out.println(employee.getMgr_no());
        context.close();


        System.out.println("container closed");

    }
}
