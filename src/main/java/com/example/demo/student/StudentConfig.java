package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam = new Student(

                    "Mariam",
                    "mariam@mail.ru",
                    LocalDate.of(2001, Month.AUGUST, 5)

            );


            Student alex = new Student(

                    "Alex8",
                    "alex@mail.ru",
                    LocalDate.of(2006, Month.APRIL, 26)

            );

            repository.saveAll(
                    List.of(mariam, alex)
            );


        };
    }
}
