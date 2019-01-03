package com.codecool.car_race;
import java.util.Random;

public class Car extends Vehicle{
    private String[] carNames = {"Paradox", "Formula", "Temper", "Alabaster", "Crusader", "Hydra", "Paragon",
            "Harmony", "Sprite", "Triumph", "Shadow", "Temperament", "Encounter", "Blaze", "Astral", "Expedition",
            "Silver", "Deputy", "Curiosity"};

    Car() {
        Random randInt = new Random();
        int randomSpeed = randInt.nextInt(110) + 80;
        setSpeed(randomSpeed);
        int firstName = randInt.nextInt(19);
        int secondName = randInt.nextInt(19);
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
