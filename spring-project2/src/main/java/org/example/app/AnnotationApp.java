package org.example.app;

import org.example.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach2 = context.getBean("balletCoach",Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach2.getDailyWorkout());
        context.close();
    }
}
