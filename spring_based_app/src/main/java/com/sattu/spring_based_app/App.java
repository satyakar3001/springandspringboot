package com.sattu.spring_based_app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext();
    	
//    	Dev dev = context.getBean(Dev.class);
    	Dev dev = new Dev();
        dev.compile();
    }
}
