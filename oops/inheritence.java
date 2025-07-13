package oops;

// 1. Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 2. Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// 3. Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// 4. Multiple Inheritance via Interface
interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Bird implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Bird flies");
    }

    public void swim() {
        System.out.println("Bird swims");
    }
}


public class inheritence {
    public static void main(String[] args) {
        // Single Inheritance
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        // Hierarchical Inheritance
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Multiple Inheritance via Interface
        Bird b = new Bird();
        b.fly();
        b.swim();
    }
}
