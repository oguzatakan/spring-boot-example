package com.atakanoguz.springbootexp.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam =new Student(
                    1L,
                    "Mariam",
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY,1)


            );

            Student alex =new Student(
                    2L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, JANUARY,1)


            );

            repository.saveAll(
                    List.of(mariam,alex)
            );
        };
    }
}
