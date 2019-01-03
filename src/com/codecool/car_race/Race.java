package com.codecool.car_race;

import java.util.LinkedList;
import java.util.List;

public class Race{
    List<Vehicle> vehicles = new LinkedList<>();

    void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Truck());
            vehicles.add(new Motorcycle());
            vehicles.add(new Car());
        }
    }

    void simulateRace() {
        Weather.setRaining();
        for (int i = 0; i < 50; i++) {
            for(Vehicle vehicle: vehicles) {
                vehicle.moveForAnHour(this);
            }
        }
    }

    void printRaceResults() {
        for(Vehicle vehicle: vehicles) {
            System.out.println("Name: " + vehicle.getName());
            System.out.println("Distance: " + vehicle.getDistanceTraveled() + "km");
            System.out.println("Type: " + vehicle.getClass().getSimpleName() + "\n");
        }
    }

    boolean isThereABrokenTruck() {
        for(Vehicle vehicle: vehicles) {
            if(vehicle.getBreakdownTurnsLeft() > 0) {
                return true;
            }
        }
        return false;
    }
}
