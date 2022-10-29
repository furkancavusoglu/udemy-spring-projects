package org.example.fortuneservice;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    @Override
    public String getDailyFortune() {
        return "You will be happy!!!";
    }
}
