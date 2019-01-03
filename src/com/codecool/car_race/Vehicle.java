package com.codecool.car_race;

public abstract class Vehicle {
    private String name;
    private int distanceTraveled = 0;
    private int speed;
    private int breakdownTurnsLeft = 0;

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getSpeed() {
        return speed;
    }

    void setName (String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setDistanceTraveled (int distance) {
        distanceTraveled += distance;
    }

    int getDistanceTraveled() {
        return distanceTraveled;
    }

    void setBreakdownTurnsLeft(int breakdownTurnsLeft) {
        this.breakdownTurnsLeft = breakdownTurnsLeft;
    }

    int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }

    abstract void moveForAnHour(Race race);
}
