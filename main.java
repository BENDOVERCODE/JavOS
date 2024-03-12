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
         int accounttotal = 1200;

        // Checking the payment method and displaying appropriate message
        if (payment == 1) {
            System.out.println("Credit");
        } else if (payment == 2){
         load = load + 1;
            System.out.println("Debit");
       load = load + 1;
        } else {
            System.out.println("Invalid payment method");
        }
      if (load == 1){
        System.out.println("Succes! your payment has been loaded");
        System.out.println("Thank you for your payment!");
        System.out.println("Your Total is:" + accounttotal);
      }
    }
}
