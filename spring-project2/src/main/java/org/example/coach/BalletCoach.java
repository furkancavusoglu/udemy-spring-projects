package org.example.coach;

import org.springframework.stereotype.Component;

@Component
public class BalletCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Do ballet";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

}
