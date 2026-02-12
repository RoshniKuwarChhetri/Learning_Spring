package com.qsp.Config;

import com.qsp.Student.Student;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com")
@PropertySource(value = "app.properties")
public class Config {
//    @Bean(value = "student")
//    //@Scope(value="singleton")
//    @Scope(value="prototype")
//    public Student student(){
//        return new Student();
//    }

}
