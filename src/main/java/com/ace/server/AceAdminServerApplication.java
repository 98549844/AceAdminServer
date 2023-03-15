package com.ace.server;

import com.ace.server.util.BeanUtil;
import de.codecentric.boot.admin.client.registration.ApplicationRegistrator;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableAdminServer
public class AceAdminServerApplication {

    public static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(AceAdminServerApplication.class, args);
        System.out.println("Spring Boot admin Quick start !!!");
        System.out.println("https://codecentric.github.io/spring-boot-admin/3.0.1/getting-started.html");
       // BeanUtil.printBeanName(applicationContext);
    }

}
