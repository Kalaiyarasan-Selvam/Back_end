//Create a class Shape with a method area(). Derive a class Rectangle with attributes length and breadth, and override the area() method.
// Further, derive a class Square from Rectangle and demonstrate multilevel inheritance.

package Day_c_Three.inheritance2;

class Shape {
    void area() {
        System.out.println("Area of shape");
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void area() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Square extends Rectangle {

    Square(double side) {
        super(side, side);
    }

    @Override
    void area() {
        double area = length * length;
        System.out.println("Area of Square: " + area);
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5.0, 3.0);
        rectangle.area();

        Shape square = new Square(4.0);
        square.area();
    }
}

