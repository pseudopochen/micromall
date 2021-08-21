package com.luban.micromall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.luban.micromall.order.mapper")
@SpringBootApplication
public class MicromallOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallOrderApplication.class, args);
    }

}
