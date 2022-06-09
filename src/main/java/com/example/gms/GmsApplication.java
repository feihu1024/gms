package com.example.gms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.gms.dao")
public class GmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmsApplication.class, args);
    }

}
