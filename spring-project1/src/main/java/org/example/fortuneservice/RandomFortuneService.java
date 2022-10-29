package org.example.fortuneservice;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private final Random random = SecureRandom.getInstanceStrong();

    private final String[] fortunes = {"You will be rich", "You will be get cheated",
            "You will die in a month", "You will be get promoted", "You will find your soulmate"};

    public RandomFortuneService() throws NoSuchAlgorithmException {
    }

    @Override
    public String getFortune() {
        int index = random.nextInt(fortunes.length);
        return fortunes[index];
    }
}
