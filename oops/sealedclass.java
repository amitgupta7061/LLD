package oops;

// File: SealedClassExample.java

// Java 17+ feature: Sealed classes restrict which other classes may extend them
sealed class Vehicle permits Car, Bike {
    void showType() {
        System.out.println("This is a vehicle");
    }
}

final class Car extends Vehicle {
    void showType() {
        System.out.println("This is a car");
    }
}

final class Bike extends Vehicle {
    void showType() {
        System.out.println("This is a bike");
    }
}

// The following would cause a compile-time error because Truck is not permitted:
// class Truck extends Vehicle {} // ❌ Not allowed

public class sealedclass {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.showType();

        Vehicle bike = new Bike();
        bike.showType();
    }
}

/*
Output:
This is a car
This is a bike
*/

/*
📝 Notes:
- `sealed` classes help control the inheritance hierarchy.
- Use `permits` to explicitly declare allowed subclasses.
- Subclasses must be `final`, `sealed`, or `non-sealed`.
- Helps maintain better control, especially in domain modeling or when creating frameworks/APIs.
*/

