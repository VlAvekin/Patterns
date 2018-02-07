package com.vladaanekin.builder;

public class BuilderArr {

    // Строитель

    public static void main(String[] args) {

//        Car car = new CarBuilder()
//                .builderMake("Mercedes")
//                .builderTransmission(Transmission.MANUAL)
//                .builderSpeed(280)
//                .build();
//        System.out.println(car);

        Director director = new Director();
        director.setBuilder(new FordMondeoBuilder());
        Car car = director.BuildCar();
        System.out.println(car);

    }

}

enum Transmission{
    MANUAL, AUTO
}

class Car{

    String make;
    Transmission transmission;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", transmission=" + transmission +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

abstract class CarBilder{
    Car car;
    void createCar(){
        car = new Car();
    }

    abstract void buildMake();
    abstract void buildTransmission();
    abstract void buildSpeed();

    Car getCar(){
        return car;
    }
}



class FordMondeoBuilder extends CarBilder {

    void buildMake() {
        car.setMake("Ford Mondeo");
    }


    void buildTransmission() {
        car.setTransmission(Transmission.AUTO);
    }

    void buildSpeed() {
        car.setMaxSpeed(260);
    }
}

class SubaruBuilder extends CarBilder{

    void buildMake() {
        car.setMake("Subaru");
    }


    void buildTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }


    void buildSpeed() {
        car.setMaxSpeed(320);
    }
}

class Director{
    CarBilder builder;

    public void setBuilder(CarBilder builder) {
        this.builder = builder;
    }

    Car BuildCar(){
        builder.createCar();
        builder.buildMake();
        builder.buildTransmission();
        builder.buildSpeed();
        Car car = builder.getCar();
        return car;
    }
}

// простой пример
//class CarBuilder {
//
//    String m = "Default";
//    Transmission t = Transmission.MANUAL;
//    int s = 120;
//
//    CarBuilder builderMake(String m){
//        this.m = m;
//        return this;
//    }
//    CarBuilder builderTransmission(Transmission t){
//        this.t = t;
//        return this;
//    }
//    CarBuilder builderSpeed(int s){
//        this.s = s;
//        return this;
//    }
//    Car build(){
//        Car car = new Car();
//        car.setMake(m);
//        car.setTransmission(t);
//        car.setMaxSpeed(s);
//        return car;
//    }
//
//}