package com.zidio.project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {
    @Bean
    public WebMvcConfigurer CorsConfigurer(){
        return new WebMvcConfigurer(){
            @Override
            public void addCorsMappings(CorsRegistry registry){
                registry.addMapping("/**") //Allow all endpoints
                        .allowedOrigins("http://localhost:3000")//Allow requests from fronted
                        .allowedMethods("GET","POST","PUT","DELETE","OPTIONS")//Allow HTTP methods
                        .allowedHeaders("*") //Allow all headers
                        .allowCredentials(true); //allow  cookies
            }
        };
    }
    
}
