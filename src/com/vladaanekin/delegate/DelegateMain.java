package com.vladaanekin.delegate;

public class DelegateMain {

    public static void main(String[] args) {

        Painter painter = new Painter();

        painter.setGraphic(new Triangel());
        painter.draw();

        painter.setGraphic(new Square());
        painter.draw();

        painter.setGraphic(new Circle());
        painter.draw();

    }

}


interface Graphics{
    void draw();
}

class Triangel implements Graphics{

    public void draw() {
        System.out.println("Рисуем треугольник");
    }
}

class Square implements Graphics{

    public void draw() {
        System.out.println("Рисуем квадрат");
    }
}

class Circle implements Graphics{

    public void draw() {
        System.out.println("Рисуем круг");
    }
}

class Painter{

    Graphics graphics;

    void setGraphic(Graphics g){
        graphics = g;
    }

    void draw(){
        graphics.draw();
    }
}