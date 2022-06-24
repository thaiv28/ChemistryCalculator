package io.github.thai.chemcalc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("io.github.thai.chemcalc")
public class Main {
    public static void main(String... args) {
        SpringApplication.run(Main.class, args);
    }
}
