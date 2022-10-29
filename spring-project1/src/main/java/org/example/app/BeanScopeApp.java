package org.example.app;

import org.example.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach coach = context.getBean("myCoach", Coach.class);
        Coach coach1 = context.getBean("myCoach", Coach.class);
        System.out.println(coach == coach1);
        System.out.println("Address of coach: " + coach + ", " + "address of coach1: " + coach1);
    }
}
