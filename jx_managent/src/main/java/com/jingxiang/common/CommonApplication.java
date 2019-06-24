package com.jingxiang.common;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommonApplication {
	@Bean
    MultipartConfigElement multipartConfigElement() {
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setLocation("d:/tmp");
        //factory.setLocation("/home/jingxiangputi");
        //factory.setLocation("/home/jxpt/tmp");
        return factory.createMultipartConfig();
    }
    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }
}
