package com.jsp;

import com.jsp.Config.Config;
import com.jsp.Phone.Phone;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
        Phone phone = context.getBean(Phone.class);
        System.out.println(phone.getBrand());
        System.out.println(phone.getProcesser());
        System.out.println(phone);
        context.close();
    }
}
