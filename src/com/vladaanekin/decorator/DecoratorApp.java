package com.vladaanekin.decorator;

public class DecoratorApp {

    public static void main(String[] args) {

        //IPrinter printer = new Printer("Привет");
        IPrinter printer  = new QuotesDecorator(new RightBracketDecorator(new LeftBracketDecorator(new Printer("Привет"))));

        printer.print();

    }

}

interface IPrinter {
    void print();
}

class Printer implements IPrinter {
    String value;

    public Printer(String value) {
        this.value = value;
    }

    public void print() {
        System.out.print(value);
    }
}

abstract class Decorator {
    IPrinter component;

    public Decorator(IPrinter component) {
        this.component = component;
    }
}

class QuotesDecorator extends Decorator implements IPrinter  {


    public QuotesDecorator(IPrinter component) {
        super(component);
    }

    public void print() {
        System.out.print("\"");
        this.component.print();
        System.out.print("\"");
    }
}

class LeftBracketDecorator extends Decorator implements IPrinter {

    public LeftBracketDecorator(IPrinter component) {
        super(component);
    }

    public void print() {
        System.out.print("[");
        this.component.print();
    }
}

class RightBracketDecorator extends Decorator implements IPrinter {

    public RightBracketDecorator(IPrinter component) {
        super(component);
    }

    public void print() {
        component.print();
        System.out.print("]");
    }
}