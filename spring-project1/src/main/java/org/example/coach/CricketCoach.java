package org.example.coach;

import org.example.fortuneservice.FortuneService;

public class CricketCoach implements Coach {
    private String emailAddress;
    private String team;
    private FortuneService fortuneService;

    CricketCoach() {
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Do some cricket things.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
