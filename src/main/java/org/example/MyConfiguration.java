package org.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Development
public class MyConfiguration {
    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("Executing in Development");
        };
    }
}
