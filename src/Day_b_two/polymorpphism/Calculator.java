//Implement method overloading in a
// class Calculator with methods to add integers, doubles, and arrays of numbers.
package Day_b_two.polymorpphism;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }


    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }


    public double add(double[] numbers) {
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of integers: " + calculator.add(5, 10));
        System.out.println("Sum of doubles: " + calculator.add(5.5, 10.5));
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Sum of integer array: " + calculator.add(intArray));
        double[] doubleArray = {1.1, 2.2, 3.3};
        System.out.println("Sum of double array: " + calculator.add(doubleArray));
    }
}
