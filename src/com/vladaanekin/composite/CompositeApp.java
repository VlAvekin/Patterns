package com.vladaanekin.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeApp {

    // Компоновшик

    public static void main(String[] args) {

        Shape square1 = new Square();
        Shape square2 = new Square();
        Shape triangel1 = new Triangel();

        Shape square3 = new Square();
        Shape triangel2 = new Triangel();
        Shape circle1 = new Cicrle();
        Shape circle2 = new Cicrle();

        Composite composite = new Composite();
        Composite composite1= new Composite();
        Composite composite2 = new Composite();

        composite1.addComponent(square1);
        composite1.addComponent(square2);
        composite1.addComponent(triangel1);

        composite2.addComponent(square3);
        composite2.addComponent(triangel2);
        composite2.addComponent(circle1);
        composite2.addComponent(circle2);

        composite.addComponent(composite1);
        composite.addComponent(composite2);


        composite.draw();

    }
}

interface Shape{
    void draw();
}

class Square implements Shape{

    public void draw() {
        System.out.println("Привет, я Квадрат");
    }
}

class Triangel implements Shape{

    public void draw() {
        System.out.println("Привет, я Треугольник");
    }
}

class Cicrle implements Shape{
    @Override
    public void draw() {
        System.out.println("Привет, я Круг");
    }
}

class Composite implements Shape{

    private List<Shape>  components  = new ArrayList<>();

    void addComponent(Shape component){
        components.add(component);
    }

    void removeComponent(Shape component){
        components.remove(component);
    }

    public void draw() {

        for (Shape component: components) {
            component.draw();
        }

    }
}