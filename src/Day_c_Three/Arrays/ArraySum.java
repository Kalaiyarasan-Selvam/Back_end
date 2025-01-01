//Create a program to calculate the sum of all elements in an array.

package Day_c_Three.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {15, 3, 42, 7, 8, 23, 4}; // Sample array

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of all elements: " + sum);
    }
}

