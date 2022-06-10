package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Car, CarDannyi> car = new HashMap<>();
        car.put(new Car(1268, 12365), new CarDannyi(2022, "Honda", 5000, "black"));
        car.put(new Car(2687, 96365), new CarDannyi(2021, "Toyota", 5000, "black"));
        car.put(new Car(1965, 85365), new CarDannyi(2020, "Lexus", 5000, "black"));
        for (HashMap.Entry map : car.entrySet()) {
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }


}
