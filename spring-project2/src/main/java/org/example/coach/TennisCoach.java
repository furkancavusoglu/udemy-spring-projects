package org.example.coach;

import org.example.fortuneservice.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//you can explicitly write custom bean name
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

    @Qualifier("randomFortuneService")
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

    @PostConstruct
    public void postConstruct() {
        System.out.println("PostConstruct");
    }
    @PreDestroy
    public void preDestroy() {
        System.out.println("PreDestroy");
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
