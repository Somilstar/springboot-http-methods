package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student don  = new Student("don", "don123@gmail.com", LocalDate.of(2004,11,21)
            );
            Student alex  = new Student("alex", "alex123@gmail.com", LocalDate.of(2000,11,21)
            );
            repository.saveAll(
                    List.of(don,alex)
            );
        };
    }
}
