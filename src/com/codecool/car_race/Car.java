package com.codecool.car_race;
import java.util.concurrent.ThreadLocalRandom;

public class Car extends Vehicle{
    private String[] carNames = {"Paradox", "Formula", "Temper", "Alabaster", "Crusader", "Hydra", "Paragon",
            "Harmony", "Sprite", "Triumph", "Shadow", "Temperament", "Encounter", "Blaze", "Astral", "Expedition",
            "Silver", "Deputy", "Curiosity"};

    Car() {
        int randomSpeed = ThreadLocalRandom.current().nextInt(80, 111);
        setSpeed(randomSpeed);
        int firstName = ThreadLocalRandom.current().nextInt(0, 19);
        int secondName = ThreadLocalRandom.current().nextInt(0, 19);
        setName(carNames[firstName] + carNames[secondName]);
    }

    @Override
    void moveForAnHour(Race race) {
        if(race.isThereABrokenTruck()) {
            setDistanceTraveled(75);
        } else {
            setDistanceTraveled(getSpeed());
        }
    }
}
