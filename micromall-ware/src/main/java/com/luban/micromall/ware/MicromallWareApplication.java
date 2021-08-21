package com.luban.micromall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.luban.micromall.ware.mapper")
@SpringBootApplication
public class MicromallWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallWareApplication.class, args);
    }

}
