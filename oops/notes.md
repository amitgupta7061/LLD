# Object-Oriented Programming (OOP) in Java: Complete Notes

---

## 1. Introduction to OOP

### What is OOP?
- A programming paradigm based on **objects** that contain **data (fields)** and **code (methods)**.
- Focuses on **abstraction, encapsulation, inheritance, and polymorphism**.

---

## 2. Core OOP Principles

### 1. Encapsulation
- Wrapping data and methods into a single unit (class).
- Use private fields with public getter/setter methods.

```java
public class Student {
    private int age;

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
```

### 2. Abstraction
- Hiding internal details and showing only necessary features.
- Achieved using abstract classes and interfaces.

```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}
```

### 3. Inheritance
- One class acquires properties and behaviors of another.

```java
class Animal {
    void eat() { System.out.println("Eats food"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barks"); }
}
```

- Types: Single, Multilevel, Hierarchical
- Java does not support multiple inheritance with classes (only with interfaces)

### 4. Polymorphism
- **Compile-time (Overloading)**: Same method name, different parameters
- **Runtime (Overriding)**: Subclass redefines method

```java
class MathUtils {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

class Animal {
    void sound() { System.out.println("Sound"); }
}

class Dog extends Animal {
    void sound() { System.out.println("Bark"); }
}
```

---

## 3. Java Classes and Objects

### Class
```java
class Car {
    String brand;
    void start() {
        System.out.println("Car is starting");
    }
}
```

### Object
```java
Car myCar = new Car();
myCar.brand = "Toyota";
myCar.start();
```

---

## 4. Constructors
- Initialize objects.
- Types: Default, Parameterized, Overloaded

```java
class Student {
    String name;

    Student() {
        name = "Default";
    }

    Student(String name) {
        this.name = name;
    }
}
```

---

## 5. this & super

### this
- Refers to the current object.
```java
this.name = name;
```

### super
- Refers to the parent class.
```java
super.method();
```

---

## 6. Access Modifiers

| Modifier  | Class | Package | Subclass | World |
|-----------|-------|---------|----------|-------|
| private   | ✅    | ❌      | ❌       | ❌    |
| default   | ✅    | ✅      | ❌       | ❌    |
| protected | ✅    | ✅      | ✅       | ❌    |
| public    | ✅    | ✅      | ✅       | ✅    |

---

## 7. static Keyword
- Belongs to the class, not the instance.

```java
class Example {
    static int count = 0;
    static void showCount() {
        System.out.println(count);
    }
}
```

---

## 8. final Keyword
- final variable: constant
- final method: can't be overridden
- final class: can't be extended

```java
final class Constants {
    final int MAX = 100;
}
```

---

## 9. Nested and Inner Classes

```java
class Outer {
    class Inner {
        void show() {
            System.out.println("Inner class");
        }
    }
}
```

---

## 10. Abstract Classes vs Interfaces

| Feature         | Abstract Class | Interface |
|----------------|----------------|-----------|
| Method Body     | Allowed        | Only default/static |
| Constructors    | Yes            | No        |
| Multiple Inherit| No             | Yes       |

```java
interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starting");
    }
}
```

---

## 11. Object Class (java.lang.Object)
- Superclass of all classes.
- Common methods: `toString()`, `equals()`, `hashCode()`, `clone()`

```java
Object obj = new String("Java");
System.out.println(obj.toString());
```

---

## 12. Method Overloading & Overriding

### Overloading
- Compile-time polymorphism
- Same name, different params

### Overriding
- Runtime polymorphism
- Same name, same signature, subclass

---

## 13. Dynamic Method Dispatch

```java
Animal a = new Dog();
a.sound(); // Dog's sound
```

---

## 14. Packages and Imports

```java
package com.example.utils;
import java.util.Scanner;
```

---

## 15. Interface Enhancements (Java 8+)

```java
interface MyInterface {
    default void show() {
        System.out.println("Default method");
    }

    static void print() {
        System.out.println("Static method");
    }
}
```

---

## 16. Custom Exceptions

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
```

---

## 17. SOLID Principles

1. **S**ingle Responsibility
2. **O**pen/Closed
3. **L**iskov Substitution
4. **I**nterface Segregation
5. **D**ependency Inversion

---

## 18. Object Class Example

```java
public class Demo {
    public static void main(String[] args) {
        Object obj = new String("Java");
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals("Java"));
    }
}
```

---

## 19. Common Interview Questions

- Difference between abstraction and encapsulation?
- How is polymorphism implemented in Java?
- Can static methods be overridden?
- Why no multiple inheritance in Java?
- What is the diamond problem?

---

## 20. Best Practices

- Use `private` fields and access through methods
- Use `interface` when possible
- Prefer composition over inheritance
- Follow SOLID principles
- Avoid deep inheritance hierarchies

---

Happy Learning Java OOP! 🚀
