package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignOneApplication.class, args);
    }

}
