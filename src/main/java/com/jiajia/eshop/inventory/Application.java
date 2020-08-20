package com.jiajia.eshop.inventory;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author zjiajia
 * @Date 2020/8/20 9:48
 */

/**
 * 库存服务的入口
 */
@SpringBootApplication
@MapperScan("com.jiajia.eshop.inventory.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
