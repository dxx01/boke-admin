package com.dxx.bokeadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dxx.bokeadmin.mapper")
public class BokeAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(BokeAdminApplication.class, args);
    }

}
