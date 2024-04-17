package com.snp;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.snp.mapper")
@SpringBootApplication
public class demo1App {
    public static void main(String[] args) {
        SpringApplication.run(demo1App.class, args);
    }
}

