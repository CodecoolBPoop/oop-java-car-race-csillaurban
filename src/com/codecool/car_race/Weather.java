package com.codecool.car_race;

import java.util.concurrent.ThreadLocalRandom;

public class Weather {
    private static boolean raining;

    static void setRaining() {
        int valueForRaining = ThreadLocalRandom.current().nextInt(1, 101);
        if(valueForRaining <= 30) {
            raining = true;
        } else {
            raining = false;
        }
    }

    static boolean isRaining() {
        return raining;
    }

}
