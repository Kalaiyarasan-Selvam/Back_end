//Define an interface Vehicle with a method start(). Derive two interfaces FourWheeler and TwoWheeler from it, each adding its specific methods.
// Implement these in relevant classes.

package Day_c_Three.Interface2;


interface Vehicle {
    void start();
}

interface FourWheeler extends Vehicle {
    void drive();
}

interface TwoWheeler extends Vehicle {
    void ride();
}

class Car implements FourWheeler {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void drive() {
        System.out.println("Car is driving.");
    }
}

class Bike implements TwoWheeler {
    @Override
    public void start() {
        System.out.println("Bike is starting.");
    }

    @Override
    public void ride() {
        System.out.println("Bike is being ridden.");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        car.start();
        ((FourWheeler) car).drive();

        bike.start();
        ((TwoWheeler) bike).ride();
    }
}
