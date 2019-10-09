package com.cyxy.wisdom;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.cyxy.wisdom.mapper")
public class WisdomApplication {
    public static void main(String[] args) {
        SpringApplication.run(WisdomApplication.class, args);
    }
}