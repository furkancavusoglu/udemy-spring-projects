package org.example.app;

import org.example.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationBeanScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("tennisCoach", Coach.class);
        Coach coach1 = context.getBean("tennisCoach", Coach.class);
        System.out.println(coach == coach1);
        System.out.println("Memory locations of coach1: " + coach + ", coach2: " + coach1);
        context.close();
    }
}
