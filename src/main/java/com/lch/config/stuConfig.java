package com.lch.config;

import com.lch.student.student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class stuConfig {
    @Bean
    public student student(){
        return new student();
    }
}
