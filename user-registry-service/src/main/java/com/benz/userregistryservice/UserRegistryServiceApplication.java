package com.benz.userregistryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class UserRegistryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserRegistryServiceApplication.class, args);
    }

}
