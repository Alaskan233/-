package com.example.onlineClass;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 钟
 */
@SpringBootApplication
@MapperScan(basePackages = "com.example.blogs.mapper")

public class BlogsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BlogsApplication.class, args);
    }
}
