package com.benz.userstorageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class UserStorageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserStorageServiceApplication.class, args);
    }

}
