//Create a program to exit a loop if the user enters the number 0 (use break).

package Day_b_two.Jump_Statements;

import java.util.Scanner;

public class JumpStatement2
{

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int number;

                System.out.println("Enter numbers (enter 0 to exit):");

                while (true) {
                    System.out.print("Enter a number: ");
                    number = scanner.nextInt();

                    if (number == 0) {
                        System.out.println("Exiting the loop. Goodbye!");
                        break;
                    }

                    System.out.println("You entered: " + number);
                }
            }
        }



