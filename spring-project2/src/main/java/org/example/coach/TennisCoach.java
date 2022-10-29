package org.example.coach;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "work tennis stuff";
    }
}
