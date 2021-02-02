package com.ba.solid.i.better;

public class Car implements Vehicle,Movable {
    double price;
    String color;

    @Override
    public void start() {
        // Implementation

    }

    @Override
    public void stop() {
        // Implementation

    }

    @Override
    public void setPrice(double price) {
        this.price = price;

    }

    @Override
    public void setColor(String color) {
        this.color=color;

    }
}
