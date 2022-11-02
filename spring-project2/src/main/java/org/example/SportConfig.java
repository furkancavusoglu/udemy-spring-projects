package org.example;

import org.example.coach.SwimCoach;
import org.example.fortuneservice.FortuneService;
import org.example.fortuneservice.SadFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:sport.properties")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService() {
        return new SadFortuneService();
    }

    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach(sadFortuneService());
    }
}
