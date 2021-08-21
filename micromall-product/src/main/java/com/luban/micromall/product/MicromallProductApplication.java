package com.luban.micromall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.luban.micromall.product.mapper")
@SpringBootApplication
public class MicromallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallProductApplication.class, args);
    }

}
