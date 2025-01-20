package Day_i_Ten;

import java.util.Stack;
import java.util.Scanner;

public class Stack_Function {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        String currentText = "";

        System.out.println("Enter actions");
        String input = scanner.nextLine();
        String[] inputActions = input.split(",");

        for (String action : inputActions) {
            action = action.trim();

            System.out.println("Processing action: " + action);

            if (action.startsWith("Type ")) {
                String text = action.substring(5);
                actions.push(currentText);
                currentText += text + " ";
            }
            else if (action.equals("Undo")) {
                if (!actions.isEmpty()) {
                    System.out.println(currentText);

                    System.out.println(actions.peek());
                } else {
                    System.out.println("No actions to undo.");
                }
            } else {
                System.out.println("Invalid action: " + action);
            }
        }


        System.out.println("Final Text: " + currentText.trim());

    }
}
