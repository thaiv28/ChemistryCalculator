package io.github.thai.chemcalc;

import io.github.thai.chemcalc.model.Molecule;
import io.github.thai.chemcalc.model.StoichiometryResult;
import io.github.thai.chemcalc.service.StoichiometryCalcService;
import org.springframework.beans.factory.annotation.Autowired;
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
