package com.vladaanekin.abstractFactory.controler.Ru;

import com.vladaanekin.abstractFactory.model.Keyboard;

public class RuKeyboard implements Keyboard {

    public void print() {
        System.out.println("Печатаем строку");
    }


    public void println() {
        System.out.println("Печатаем строку с переносом");
    }
}
