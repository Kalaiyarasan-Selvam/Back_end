//Create a class Vehicle with a method start(). Derive a class Car that overrides the start() method.
// Write a program to demonstrate method overriding

package Day_c_Three.inheritance;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start();

        Vehicle car = new Car();
        car.start();
    }
}

