package com.epam.OOP;

public class Animal {
    private final String color;
    private final int numberOfPaws;
    private final boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paws = (numberOfPaws == 1) ? "paw" : "paws";
        return "This animal is mostly " + color
                + ". It has " + numberOfPaws + " " + paws + " and "
                + (hasFur ? "a" : "no") + " fur.";
    }
}
