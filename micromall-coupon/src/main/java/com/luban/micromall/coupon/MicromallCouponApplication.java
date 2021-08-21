package com.luban.micromall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.luban.micromall.coupon.mapper")
@SpringBootApplication
public class MicromallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicromallCouponApplication.class, args);
    }

}
