package com.dzpykj.quartzspring.common.quartz;

import org.springframework.context.support.AbstractApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
public class AppMain {  
  
    public static void main(String args[]){  
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/**/*spring-*.xml");  
    }  
  
}  