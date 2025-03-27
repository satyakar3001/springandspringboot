package com.SpringBootAppOne.WebAppOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaRepositories("com.SpringBootAppOne.WebAppOne.repository")
public class WebAppOneApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(WebAppOneApplication.class, args);
//
//        System.out.println("-------------------------------------------------------------");
//        System.out.println("🔍 Listing all Beans registered in Spring Context:");
//        System.out.println("-------------------------------------------------------------");

        // Get all bean names and sort them alphabetically
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);

//        for (String beanName : beanNames) {
//            System.out.println(beanName);
//        }

//        System.out.println("-------------------------------------------------------------");
//        System.out.println("✅ Total Beans Loaded: " + beanNames.length);
//        System.out.println("-------------------------------------------------------------");
    }
}
