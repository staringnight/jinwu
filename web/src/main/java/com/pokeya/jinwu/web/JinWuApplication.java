package com.pokeya.jinwu.web;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author: huangjl
 * @date: 2022/4/11
 */
@EnableTransactionManagement
@EnableDubbo
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.pokeya.jinwu.infrastructure")
@ComponentScan({"com.pokeya.jinwu", "com.pokeya.yao"})
public class JinWuApplication {

    public static void main(String[] args) {
        SpringApplication.run(JinWuApplication.class, args);
    }
}
