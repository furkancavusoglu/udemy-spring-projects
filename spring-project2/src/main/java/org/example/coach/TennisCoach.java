package org.example.coach;

import org.example.fortuneservice.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//you can explicitly write custom bean name
@Component
public class TennisCoach implements Coach {

    @Qualifier("restFortuneService")
    @Autowired
    private FortuneService fortuneService;

//    @Autowired
//    public TennisCoach(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "work tennis stuff";
    }

    public String getFortuneService() {
        return fortuneService.getDailyFortune();
    }
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }
//    @Autowired
//    public void someFunction(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }
}
