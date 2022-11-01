package org.example.coach;

import org.example.fortuneservice.FortuneService;

public class SwimCoach implements Coach {

    FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "swim 1 km";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
