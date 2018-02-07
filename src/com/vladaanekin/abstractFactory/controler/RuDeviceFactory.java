package com.vladaanekin.abstractFactory.controler;

import com.vladaanekin.abstractFactory.controler.Ru.RuKeyboard;
import com.vladaanekin.abstractFactory.controler.Ru.RuMouse;
import com.vladaanekin.abstractFactory.controler.Ru.RuTouchpad;
import com.vladaanekin.abstractFactory.model.DeviceFactory;
import com.vladaanekin.abstractFactory.model.Keyboard;
import com.vladaanekin.abstractFactory.model.Mouse;
import com.vladaanekin.abstractFactory.model.Touchpad;

public class RuDeviceFactory implements DeviceFactory {
    public Mouse getMouse() {
        return new RuMouse();
    }


    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }


    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }
}
