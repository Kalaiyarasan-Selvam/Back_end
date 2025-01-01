//Write a program to find the largest and smallest numbers in an array.

package Day_c_Three.Arrays;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = {15, 3, 42, 7, 8, 23, 4}; // Sample array

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
            if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}

