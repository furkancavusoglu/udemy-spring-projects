package org.example.app;

import org.example.coach.Coach;
import org.example.coach.TrackCoach;

public class MyApp {
    public static void main(String[] args) {
        Coach coach = new TrackCoach();
        System.out.println(coach.getDailyWorkout());
    }
}
