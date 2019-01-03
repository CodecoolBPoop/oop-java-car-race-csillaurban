package com.codecool.car_race;

import java.util.concurrent.ThreadLocalRandom;

public class Truck extends Vehicle {

    Truck() {
        setSpeed(100);
        setName("Truck" + ThreadLocalRandom.current().nextInt(0, 1001));
    }

    @Override
    void moveForAnHour(Race race) {
        int valueForBreakDown = ThreadLocalRandom.current().nextInt(1, 101);

        if(valueForBreakDown <= 5 && getBreakdownTurnsLeft() == 0) {
            setDistanceTraveled(0);
            setBreakdownTurnsLeft(2);
        } else if(getBreakdownTurnsLeft() > 0) {
            setDistanceTraveled(0);
            int breakDownTurnsLeft = getBreakdownTurnsLeft();
            setBreakdownTurnsLeft(breakDownTurnsLeft - 1);
        }

        if(!race.isThereABrokenTruck() && getBreakdownTurnsLeft() == 0) {
            setDistanceTraveled(getSpeed());
        }
    }
}
