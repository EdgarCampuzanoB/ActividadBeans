package com.example.springcoredojo.practica2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Usuario.class)
public class ConfigPractica {
    @Bean
    public Alumno getAlumno(){
        return new Alumno("Edgar", "Campuzano", 26);
    }
}
