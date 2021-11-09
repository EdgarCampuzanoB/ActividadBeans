package com.example.springcoredojo.NTT;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Compania.class)
public class Config {
    @Bean
    public Direccion getDireccion(){
        return new Direccion(20, "Miami");
    }
}
