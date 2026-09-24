package com.upiiz.hexagonal.config;

import com.upiiz.hexagonal.application.CategoriaService;
import com.upiiz.hexagonal.domian.port.in.CategoriaUserCase;
import com.upiiz.hexagonal.domian.port.out.CategoriaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    //Frijolitos que se van a comer
    //Instancias que la app va a usar

    //Adaptador de salida BD
    /*@Bean
    public CategoriaRepository categoriaRepository() {
        return null;
    }*/

    //Puerto de entrada -Rest
    @Bean
    public CategoriaUserCase categoriaUserCase(CategoriaRepository categoriaRepository) {
        return new CategoriaService(categoriaRepository);
    }
}
