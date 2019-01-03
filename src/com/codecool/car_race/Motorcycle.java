package com.codecool.car_race;

import java.util.concurrent.ThreadLocalRandom;

public class Motorcycle extends Vehicle{
    private int nameInt = 1;

    Motorcycle() {
        setName("Motorcycle " + nameInt++);
        setSpeed(100);
    }

    @Override
    void moveForAnHour(Race race) {
        int decrSpeed = ThreadLocalRandom.current().nextInt(5, 51);
        if(Weather.isRaining()) {
            setDistanceTraveled(getSpeed() - decrSpeed);
        } else {
            setDistanceTraveled(getSpeed());
        }
    }
}
