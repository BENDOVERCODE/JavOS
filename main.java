import java.util.Scanner; // Import Scanner class for user input

public class Main {

    public static void main(String[] args) {
        System.out.println("You'll love Java");
        System.out.println("Welcome to JavOS");

        // Creating a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your payment method (1 for Credit, 2 for Debit):");

        // Reading user input
        int payment = keyboard.nextInt();
        int load = 0;
        int accountTotalDebit = 1200; 
        int accountTotalCredit = 2000;

        // Checking the payment method and displaying appropriate message
        if (payment == 1) {
            load = 2;
            System.out.println("Credit");
        } else if (payment == 2) {
            load = 1; // setting load to 1 if payment method is "Debit"
            System.out.println("Debit");
        } else {
            System.out.println("Invalid payment method");
        }

        if (load == 1) {
            System.out.println("Success! Your payment has been loaded: DEBIT");
            System.out.println("Thank you for your payment!");
            System.out.println("Your Total is: " + accountTotalDebit); // corrected variable name
        }
        if (load == 2) {
            System.out.println("Success! Your payment has been loaded");
            System.out.println("Thank you for your payment!");
            System.out.println("Your Total is: " + accountTotalCredit); // corrected variable name
        }

        // Call the other method
        program(keyboard);
    }

    public static void program(Scanner keyboard) {
        System.out.println("Select Program to Start");
        System.out.println("1: Calculator 2: Account management");

        System.out.println("Enter your program selection:");

        // Reading user input for program selection
        int programLoad = keyboard.nextInt();
        int program = 0;
        String userName = "JAVOS24"; // Corrected to String type
        String passWord = "2024"; // Corrected to String type

        if (programLoad == 1) {
            program = 2;
            System.out.println("CALCULATOR");
        } else if (programLoad == 2) {
            program = 1; // setting program to 1 if programLoad is "2"
            System.out.println("ACCOUNT MANAGEMENT");
        } else {
            System.out.println("Invalid Program");
        }

        if (program == 1) {
            System.out.println("Welcome to calculator");
            System.out.println("Thank you for your payment!");
        }
        if (program == 2) {
            System.out.println("Account Management");
            System.out.println("Thank you for your payment!");
        }
        calculator(keyboard);
    }
public static void calculator(Scanner keyboard) {
    System.out.println("Select Operation:");
    System.out.println("1: Addition");
    System.out.println("2: Subtraction");
    System.out.println("3: Multiplication");
    System.out.println("4: Division");

    // Reading user input for operation selection
    int operationNumber = keyboard.nextInt();

    // Variables to store operand values
    int operand1, operand2;

    // Reading operand values from the user
    System.out.println("Enter first operand:");
    operand1 = keyboard.nextInt();

    System.out.println("Enter second operand:");
    operand2 = keyboard.nextInt();

    // Process the selected operation
    switch (operationNumber) {
        case 1:
            // Addition operation
            int sum = operand1 + operand2;
            System.out.println("Result of Addition: " + sum);
            break;
        case 2:
            // Subtraction operation
            int difference = operand1 - operand2;
            System.out.println("Result of Subtraction: " + difference);
            break;
        case 3:
            // Multiplication operation
            int product = operand1 * operand2;
            System.out.println("Result of Multiplication: " + product);
            break;
        case 4:
            // Division operation
            if (operand2 != 0) {
                double quotient = (double) operand1 / operand2;
                System.out.println("Result of Division: " + quotient);
            } else {
                System.out.println("Error: Division by zero!");
            }
            break;
        default:
            // Invalid operation
            System.out.println("Invalid Operation");
    }
}

}
