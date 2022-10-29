package org.example.app;

import org.example.coach.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach coach = context.getBean("myCoach",Coach.class);

        context.close();
    }
}
