package org.example;

public class Car {
    // Eigenschaften
    String brand;
    String model;
    String color;
    int yearBuilt;
    int speed;
    boolean engineON;

    // Konstruktor
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.engineON = false;
        this.speed = 0;

    }
    // Methoden
    public String startCar() {
        if (!engineON) {
            engineON = true;
            return brand + model + " now makes Brumm, Brumm!";
        } else {
            return brand + model + "is already running";
        }
    }

    public String accelerateSpeed(int addTempo) {
        if (engineON) {
            speed = speed + addTempo;
            return brand + model + " moves now at " + speed + " km/h.";
        } else {
            return brand + model + " is not moving.";
        }
    }

}
