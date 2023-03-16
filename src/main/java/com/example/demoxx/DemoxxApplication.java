package com.example.demoxx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demoxx.mapper")
public class DemoxxApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoxxApplication.class, args);
    }

}
