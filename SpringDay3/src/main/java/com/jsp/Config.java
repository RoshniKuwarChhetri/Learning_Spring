package com.jsp;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

@Configurable
@ComponentScan(basePackages = "com")
//@ComponentScan({"com.jsp","com.qsp"})
public class Config {
}
