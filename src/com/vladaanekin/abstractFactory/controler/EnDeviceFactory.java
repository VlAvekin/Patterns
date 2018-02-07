package com.vladaanekin.abstractFactory.controler;

import com.vladaanekin.abstractFactory.controler.En.EnKeyboard;
import com.vladaanekin.abstractFactory.controler.En.EnMouse;
import com.vladaanekin.abstractFactory.controler.En.EnTouchpad;
import com.vladaanekin.abstractFactory.model.DeviceFactory;
import com.vladaanekin.abstractFactory.model.Keyboard;
import com.vladaanekin.abstractFactory.model.Mouse;
import com.vladaanekin.abstractFactory.model.Touchpad;

public class EnDeviceFactory implements DeviceFactory {

    public Mouse getMouse() {
        return new EnMouse();
    }

    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }

    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }
}
