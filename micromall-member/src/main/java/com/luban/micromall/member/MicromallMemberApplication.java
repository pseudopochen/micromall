package com.luban.micromall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.luban.micromall.member.mapper")
@SpringBootApplication
public class MicromallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallMemberApplication.class, args);
    }

}
