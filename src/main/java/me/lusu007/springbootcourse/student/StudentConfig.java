package me.lusu007.springbootcourse.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
      Student lukas = new Student(
          "Lukas",
          "lukas.jost@outlook.com",
          LocalDate.of(1999, Month.NOVEMBER, 14));

      Student annika = new Student(
          "Annika",
          "annika.knirsch@gmail.com",
          LocalDate.of(2001, Month.MARCH, 11));

      repository.saveAll(List.of(lukas, annika));
    };
  }
}
