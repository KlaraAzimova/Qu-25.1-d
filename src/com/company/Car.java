package com.company;

public class Car {
    private int num;
    private int ID;

    public Car(int num, int ID) {
        this.num = num;
        this.ID = ID;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Car: " +
                "num " + num +
                ", ID " + ID;

    }
}
