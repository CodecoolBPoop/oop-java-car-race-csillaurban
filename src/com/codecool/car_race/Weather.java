package com.codecool.car_race;

import java.util.Random;

public class Weather {
    private static boolean raining;

    static void setRaining() {
        Random randInt = new Random();
        int valueForRaining = randInt.nextInt(100) + 1;
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
