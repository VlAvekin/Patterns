package com.vladaanekin.abstractFactory.controler.Ru;

import com.vladaanekin.abstractFactory.model.Mouse;

public class RuMouse implements Mouse {

    public void click() {
        System.out.println("Щелчок мышью");
    }


    public void dblclick() {
        System.out.println("двойной щелчок мышью");
    }


    public void scroll(int direction) {
        if (direction > 0)
            System.out.println("Скролинг вверх");
        else if (direction < 0)
            System.out.println("Скролинг вниз");
        else
            System.out.println("не Скролим");

    }
}
