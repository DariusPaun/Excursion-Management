package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow requests from your frontend (localhost:3000) and other methods
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // Adjust to your frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Add methods you need
                .allowedHeaders("*") // Allow all headers
                .allowCredentials(true); // Allow cookies to be sent
    }
}
