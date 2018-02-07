package com.vladaanekin.factoryMethod;

import java.util.Date;

public class FactoryMethodApp {

    // Фабрика

    public static void main(String[] args) {

//        Watch watch = new DigitalWatch();
//        watch.showTime();

        WatchMaker maker = new RoomWatchMaker();

        Watch watch = maker.createWatch(); // неизменимий код
        watch.showTime();

    }

}

interface Watch{
    void showTime();
}

class DigitalWatch implements Watch{

    public void showTime() {
        System.out.println(new Date());
    }
}

class RoomWatch implements Watch{

    public void showTime() {
        System.out.println("VII-XX");
    }
}

interface WatchMaker{
    Watch createWatch();
}

class DigitalWatchMaker implements WatchMaker{

    public Watch createWatch() {
        return new DigitalWatch();
    }
}

class RoomWatchMaker implements WatchMaker{

    public Watch createWatch() {
        return new RoomWatch();
    }
}