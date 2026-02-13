package com.jsp.Subject;

import org.springframework.stereotype.Component;

@Component
//@primary
public class Apple implements Mobile {
    @Override
   public void m2(){
        System.out.println("apple");

    }
}
