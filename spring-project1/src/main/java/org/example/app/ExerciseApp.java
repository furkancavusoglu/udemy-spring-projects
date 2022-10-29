package org.example.app;

import org.example.coach.BasketballCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.stream.IntStream;

public class ExerciseApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BasketballCoach coach = context.getBean("myBasketballCoach", BasketballCoach.class);

        IntStream.rangeClosed(0, 2).forEach(i -> System.out.println(coach.getDailyFortune()));

        context.close();
    }
}
