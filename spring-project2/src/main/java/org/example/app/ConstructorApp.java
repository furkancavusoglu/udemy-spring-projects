package org.example.app;

import org.example.coach.Coach;
import org.example.coach.TennisCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TennisCoach coach = context.getBean("tennisCoach", TennisCoach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getFortuneService());
        context.close();
    }
}
