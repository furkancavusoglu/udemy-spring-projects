package org.example.coach;

import org.example.fortuneservice.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//you can explicitly write custom bean name
@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "work tennis stuff";
    }

    public String getFortuneService() {
        return fortuneService.getDailyFortune();
    }
}
