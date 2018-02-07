package com.vladaanekin.abstractFactory;

import com.vladaanekin.abstractFactory.controler.EnDeviceFactory;
import com.vladaanekin.abstractFactory.controler.RuDeviceFactory;
import com.vladaanekin.abstractFactory.model.DeviceFactory;
import com.vladaanekin.abstractFactory.model.Keyboard;
import com.vladaanekin.abstractFactory.model.Mouse;
import com.vladaanekin.abstractFactory.model.Touchpad;

public class AbstractFactory {

    // абстрактная Фабрика

    public static void main(String[] args) {

        DeviceFactory factory = getFactoryByCountryCode("EN");

        Mouse mouse = factory.getMouse();
        Keyboard keyboard = factory.getKeyboard();
        Touchpad touchpad = factory.getTouchpad();

        mouse.click();
        keyboard.print();
        touchpad.track(10, 35);
        mouse.dblclick();
        mouse.scroll(10);

    }

    private static DeviceFactory getFactoryByCountryCode(String code){
        switch (code){
            case "RU":
                return new RuDeviceFactory();
            case "EN":
                return new EnDeviceFactory();
            default:
                throw new  RuntimeException("Unsupported Country Code: " + code);

        }
    }

}
