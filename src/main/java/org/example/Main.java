package org.example;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Car vehicle = new Car("VW", "T5");
        Car vehicle2 = new Car("Mercedes", "A-Class");
        vehicle2.engineON = true;

        Person person1 = new Person("Maria", 30, "Hamburg");
        Person person2 = new Person("Karl", 42, "Berlin");
        Person person3 = new Person("Hubert", 57, "Bern in Switzerland");

        System.out.println(vehicle.startCar());
        System.out.println(vehicle.accelerateSpeed(50));

        System.out.println(vehicle2.startCar());
        System.out.println(vehicle2.accelerateSpeed(100));

        person1.introducePerson();

        person2.introducePerson();

        person3.introducePerson();

    }
}