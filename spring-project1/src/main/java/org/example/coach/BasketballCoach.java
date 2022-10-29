package org.example.coach;

import org.example.fortuneservice.FortuneService;

public class BasketballCoach implements Coach {

    private final FortuneService fortuneService;

    BasketballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do some work on your free throws";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
