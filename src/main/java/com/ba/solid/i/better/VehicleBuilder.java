package com.ba.solid.i.better;

public class VehicleBuilder {
    public static Car buildCar(){
        Car car = new Car();
        car.setPrice(15.00);
        car.setColor("green");
        car.start();
        return car;
    }
    public static Aeroplane buildAeroPlane(){
        Aeroplane aeroplane = new Aeroplane();
        aeroplane.setPrice(25.00);
        aeroplane.setColor("red");
        aeroplane.start();
        aeroplane.fly();
        return aeroplane;
    }
}
