package com.codecool.car_race;
import java.util.Random;

public class Truck extends Vehicle {

    Truck() {
        Random randInt = new Random();
        setSpeed(100);
        setName("Truck" + randInt.nextInt(1001));
    }

    @Override
    void moveForAnHour(Race race) {
        Random randInt = new Random();
        int valueForBreakDown = randInt.nextInt(100) + 1;

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
