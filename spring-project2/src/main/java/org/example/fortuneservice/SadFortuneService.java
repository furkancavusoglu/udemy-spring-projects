package org.example.fortuneservice;

public class SadFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "You will die";
    }
}
