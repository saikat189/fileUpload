package com.practice;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.MultipartFilter;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
public class SpringBoot2FileUpload {

    private static Logger LOG = LoggerFactory.getLogger(SpringBoot2FileUpload.class);
    
    public static void main(String[] args) {
        LOG.info("SpringBoot2FileUpload Application is Starting...");
        try {
            SpringApplication.run(SpringBoot2FileUpload.class, args);
        } catch (Exception e) {
            LOG.error("Error occurred while starting SpringBoot2FileUpload");
        }
        LOG.info("SpringBoot2FileUpload Application Started..");

    }

    @Bean(name = "multipartResolver")
    public CommonsMultipartResolver multipartResolver() {

        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(-1);
        return multipartResolver;

    }
}