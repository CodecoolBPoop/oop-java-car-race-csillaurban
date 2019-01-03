package com.codecool.car_race;

import java.util.Random;

public class Motorcycle extends Vehicle{
    private int nameInt = 1;

    Motorcycle() {
        setName("Motorcycle " + nameInt++);
        setSpeed(100);
    }

    @Override
    void moveForAnHour(Race race) {
        Random randInt = new Random();
        int decrSpeed = randInt.nextInt(50) + 5;
        if(Weather.isRaining()) {
            setDistanceTraveled(getSpeed() - decrSpeed);
        } else {
            setDistanceTraveled(getSpeed());
        }
    }
}
