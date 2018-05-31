package com.diao.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dxf
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = "com.diao")
@EnableAutoConfiguration
public class MemberApplication {


    public static void main(String[] args) {
        SpringApplication.run(MemberApplication.class, args);
    }
}
