package org.example.fortuneservice;

import org.springframework.stereotype.Component;

@Component
public class RESTFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Rest Fortune service";
    }
}
