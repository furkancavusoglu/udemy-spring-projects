package org.example.app;

import org.example.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}
