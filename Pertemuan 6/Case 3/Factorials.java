import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        String keepGoing = "y";
        Scanner scan = new Scanner(System.in);

        // Loop to allow multiple factorial calculations
        while (keepGoing.equals("y") || keepGoing.equals("Y")) {
            System.out.print("Enter an integer: ");
            int val = scan.nextInt();

            try {
                // Try to compute the factorial
                System.out.println("Factorial(" + val + ") = " + MathUtils.factorial(val));
            } catch (IllegalArgumentException e) {
                // Catch and handle the exception if thrown
                System.out.println("Error: " + e.getMessage());
            }

            // Ask if the user wants to calculate another factorial
            System.out.print("Another factorial? (y/n) ");
            keepGoing = scan.next();
        }

        scan.close();  // Close the scanner
    }
}
