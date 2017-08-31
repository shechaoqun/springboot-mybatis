package com.shechaoqun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by chaoqunshe on 8/29/17.
 */
@SpringBootApplication
public class IMSApplication extends SpringBootServletInitializer {


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IMSApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(IMSApplication.class, args);
    }
}
