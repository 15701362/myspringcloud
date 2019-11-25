package com.sunliang.testservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableEurekaClient
@SpringBootApplication
public class TestServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServiceAApplication.class, args);
    }

}
