package StrategyDesignPattern;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Context context = new Context();

        // Read user input for two numbers.
        System.out.print("Enter the first number: ");
        int first = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int second = scanner.nextInt();

        // Ask the user for the desired operation.
        System.out.print("Enter operation (add, subtract, multiply): ");
        String operation = scanner.next();

        // Set the strategy based on user input.
        switch (operation.toLowerCase()) {
            case "add":
                context.setStrategy(new ConcreteStrategyAdd());
                break;
            case "subtract":
                context.setStrategy(new ConcreteStrategySubtract());
                break;
            case "multiply":
                context.setStrategy(new ConcreteStrategyMultiply());
                break;
            default:
                System.out.println("Invalid operation. Exiting.");
                scanner.close();
                return;
        }

        // Execute the strategy and display the result.
        int result = context.executeStrategy(first, second);
        System.out.println("Result: " + result);
        scanner.close();
    }
}

