package com.vladaanekin.abstractFactory.controler.En;

import com.vladaanekin.abstractFactory.model.Keyboard;

public class EnKeyboard implements Keyboard {

    public void print() {
        System.out.println("Print");
    }


    public void println() {
        System.out.println("Print Line");
    }
}
