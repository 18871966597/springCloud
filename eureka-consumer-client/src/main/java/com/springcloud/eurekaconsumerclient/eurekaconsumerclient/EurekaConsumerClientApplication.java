package com.springcloud.eurekaconsumerclient.eurekaconsumerclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class EurekaConsumerClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaConsumerClientApplication.class, args);
    }

}
