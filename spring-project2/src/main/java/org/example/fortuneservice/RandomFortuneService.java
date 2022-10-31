package org.example.fortuneservice;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    private final String[] data = {
            "Beware of the wolf in sheeps clothing", "Dilligence is mother of good luck", "The journey is the reward"
    };

    @Override
    public String getDailyFortune() {
        Random random = new Random();
        return data[random.nextInt(data.length)];
    }
}
