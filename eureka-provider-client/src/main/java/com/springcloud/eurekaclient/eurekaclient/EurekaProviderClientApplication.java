package com.springcloud.eurekaclient.eurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaProviderClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderClientApplication.class, args);
    }

}
