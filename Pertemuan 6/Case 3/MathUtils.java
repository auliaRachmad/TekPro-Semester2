public class MathUtils {
    public static int factorial(int n) {
        // Check if the input is negative or greater than 16
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        } else if (n > 16) {
            throw new IllegalArgumentException("Factorial is only defined for numbers 0 through 16.");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}
