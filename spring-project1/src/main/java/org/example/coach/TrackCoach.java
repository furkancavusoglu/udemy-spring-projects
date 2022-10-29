package org.example.coach;

import org.example.fortuneservice.FortuneService;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach() {

    }

    TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void onInit() {
        System.out.println("TrackCoach onInit");
    }

    public void onDestroy() {
        System.out.println("TrackCoach onDestroy");

    }
}