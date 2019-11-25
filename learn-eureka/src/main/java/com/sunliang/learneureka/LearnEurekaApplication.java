package com.sunliang.learneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class LearnEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LearnEurekaApplication.class, args);
    }

}
