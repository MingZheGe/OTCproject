package com.example.otc_project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value ="com.example.otc_project.dao")
public class OtcProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(OtcProjectApplication.class, args);
    }

}
