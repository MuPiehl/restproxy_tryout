package de.mpi.hello;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * Created by MPi on 24.10.2014.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = org.springframework.boot.SpringApplication.run(SpringApplication.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

}
