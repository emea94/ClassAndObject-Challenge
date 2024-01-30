package org.example;

import static java.lang.System.*;

public class Person {
    // Eigenschaften
    String name;
    String gender;
    int age;
    String location;

    // Konstruktoren
    public Person(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }
    // Methoden
    public void introducePerson() {
        System.out.println("Hello, my name is " + name + ", I am from " + location + " and I am " + age + " years old.");
    }
}
