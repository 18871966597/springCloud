package com.springcloud.ll.eurakserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurakServerApplication.class, args);
    }

}
