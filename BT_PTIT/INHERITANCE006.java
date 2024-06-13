/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_PTIT;

/**
 *
 * @author phong
 */

abstract class Animal {
    int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    void walk() {
        System.out.println("This animal walks on " + legs + " legs.");
    }

    abstract void eat();
}

interface Pet {
    String getName();
    void setName(String name);
    void play();
}

class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    void eat() {
        System.out.println("The spider eats a fly.");
    }
}

class Fish extends Animal implements Pet {
    String name;

    public Fish() {
        super(0);
    }

    @Override
    void walk() {
        super.walk();
        System.out.println("Fish, of course, can't walk; they swim.");
    }

    @Override
    void eat() {
        System.out.println("Fish eat pond scum.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish swim in their tanks all day.");
    }
}

class Cat extends Animal implements Pet {
    String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with string.");
    }

    @Override
    void eat() {
        System.out.println("Cats like to eat spiders and mice.");
    }
}

public class INHERITANCE006 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.play();
        fish.walk();

        Cat cat = new Cat("Fluffy");
        cat.play();
        cat.eat();

        Spider spider = new Spider();
        spider.eat();

        cat.walk();
        spider.walk();
    }
}
