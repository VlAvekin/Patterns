package com.vladaanekin.prototype;

public class PrototypeApp {

    // Прототип

    public static void main(String[] args) {

        Human human = new Human(22, "Vlad");
        System.out.println(human);

        Human copu = (Human) human.copy();
        System.out.println(copu);

        HumanFactory factory = new HumanFactory(copu);
        Human h1 = factory.makeCopy();
        System.out.println(h1);

        factory.setHuman(new Human(25, "Yaric"));
        Human h2 = factory.makeCopy();
        System.out.println(h2);
    }

}

interface Copyable{
    Object copy();
}

class Human implements Copyable{

    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Object copy() {
        Human copy = new Human(age, name);
        return copy;
    }
}

// Добавим фабрику для оптимизацыи

class HumanFactory{
    Human human;

    public HumanFactory(Human human){
        setHuman(human);
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    Human makeCopy(){
        return (Human)human.copy();
    }
}
