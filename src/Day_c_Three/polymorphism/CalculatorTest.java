//Create a class Calculator with overloaded methods add(int, int),
// add(double, double), and add(int, int, int). Test all methods.

package Day_c_Three.polymorphism;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInt = calculator.add(5, 3);
        System.out.println("Sum of two integers: " + sumInt); // Output: 8

        double sumDouble = calculator.add(4.5, 3.2);
        System.out.println("Sum of two doubles: " + sumDouble); // Output: 7.7

        int sumThreeInt = calculator.add(1, 2, 3);
        System.out.println("Sum of three integers: " + sumThreeInt); // Output: 6
    }
}
