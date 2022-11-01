package org.example;

import org.example.coach.SwimCoach;
import org.example.fortuneservice.FortuneService;
import org.example.fortuneservice.HappyFortuneService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("org.example")
public class SportConfig {

    @Bean
    public FortuneService happyFortuneService(){
        return new HappyFortuneService();
    }

    @Bean
    public SwimCoach swimCoach() {
        return new SwimCoach(happyFortuneService());
    }
}
