package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author chihaojie
 * @Description 启动类
 * @date 2019/3/29   18:42
 **/
@SpringBootApplication
@MapperScan("com.dao")
public class StartApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
        System.out.println(".................ES微服务启动完成...............");
    }
}
