package com.company;

public class CarDannyi {
    private int godVypusk;
    private String model;
    private int price;
    private String color;

    public CarDannyi(int godVypusk, String model, int price, String color) {
        this.godVypusk = godVypusk;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getGodVypusk() {
        return godVypusk;
    }

    public void setGodVypusk(int godVypusk) {
        this.godVypusk = godVypusk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nCarDannyi: " +
                "godVypusk " + godVypusk +
                ", model " + model +
                ", price " + price +
                ", color " + color;

    }
}
