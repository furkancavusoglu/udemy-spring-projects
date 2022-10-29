package org.example.coach;

import org.example.fortuneservice.FortuneService;

public class BaseballCoach implements Coach {
    private FortuneService fortuneService;

    BaseballCoach() {
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}
