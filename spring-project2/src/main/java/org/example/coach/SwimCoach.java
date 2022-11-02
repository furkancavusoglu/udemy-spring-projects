package org.example.coach;

import org.example.fortuneservice.FortuneService;
import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String mail;
    @Value("${foo.team}")
    private String team;

    FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "swim 1 km ," + mail + " ," + team;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
