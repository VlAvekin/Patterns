package com.vladaanekin.abstractFactory.controler.Ru;

import com.vladaanekin.abstractFactory.model.Touchpad;

public class RuTouchpad implements Touchpad {

    public void track(int deltaX, int deltaY) {
        int s = (int)Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        System.out.println("Передвинуть на " + s + " пикселей");
    }
}
