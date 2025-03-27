package com.sattu.springApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args)
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//    	dev obj = (dev) context.getBean(dev.class);
//    	obj.compile();
//		System.out.println(obj.getAge());   
		
//		obj.getLaptop();
    	       
    	System.out.println("-------------------------------------------------------------");

    	dev2forAutowiring dev2Obj = (dev2forAutowiring) context.getBean(dev2forAutowiring.class);
    	System.out.println("Running from dev class");
    	dev2Obj.build();
		
    	
    	System.out.println("-------------------------------------------------------------");

    	String[] beanNames = context.getBeanDefinitionNames();
        
        System.out.println("All Beans in IoC Container:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
        
    }

}
