//Define an interface Constants with static fields like PI = 3.14.
// Create a class Circle that uses this constant to calculate the area of a circle.

package Day_c_Three.Interface;

interface Constants {
    double PI = 3.14;
}

class Circle implements Constants {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Constants.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();
    }
}

