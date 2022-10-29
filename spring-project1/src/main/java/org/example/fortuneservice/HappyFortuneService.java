package org.example.fortuneservice;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "You will have lots of money!!!";
    }
}
