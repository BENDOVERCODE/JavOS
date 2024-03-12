import java.util.Scanner; // Import Scanner class for user input

public class Displayer {

    public static void main(String[] args) {
        System.out.println("You'll love Java");

        // Creating a Scanner object for user input
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your payment method (1 for Credit, 2 for Debit):");

        // Reading user input
        int payment = keyboard.nextInt();

        // Checking the payment method and displaying appropriate message
        if (payment == 1) {
            System.out.println("Credit");
        } else if (payment == 2) {
            System.out.println("Debit");
        } else {
            System.out.println("Invalid payment method");
        }
    }
}
