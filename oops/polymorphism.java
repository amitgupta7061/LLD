package oops;

// File: PolymorphismExample.java

// Compile-time Polymorphism
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

// Runtime Polymorphism
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


public class polymorphism {
    public static void main(String[] args) {
        // Compile-time
        Calculator calc = new Calculator();
        System.out.println("Add ints: " + calc.add(2, 3));
        System.out.println("Add doubles: " + calc.add(2.5, 3.1));

        // Runtime
        Animal animal = new Dog();
        animal.sound();
    }
}
