//Create an abstract class Appliance with methods turnOn() (abstract) and turnOff() (non-abstract).
// Derive a class Fan and implement turnOn().

package Day_c_Three.Abstract_class;

abstract class Appliance {
    public abstract void turnOn();

    public void turnOff() {
        System.out.println("The appliance is turned off.");
    }
}

class Fan extends Appliance {
    @Override
    public void turnOn() {
        System.out.println("The fan is now turned on.");
    }
}

public class ApplianceTest {
    public static void main(String[] args) {
        Appliance fan = new Fan();
        fan.turnOn();
        fan.turnOff();
    }
}
