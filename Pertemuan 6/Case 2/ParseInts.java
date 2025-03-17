import java.util.Scanner;

public class ParseInts {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter a line of text
        System.out.println("Enter a line of text");

        // Read the line of input
        Scanner scanLine = new Scanner(scan.nextLine());

        // Loop through each token in the line
        while (scanLine.hasNext()) {
            try {
                // Try parsing an integer from the token
                val = Integer.parseInt(scanLine.next());
                sum += val;  // Add to sum if parsing is successful
            } catch (NumberFormatException e) {
                // Catch the exception and do nothing (ignore non-integer tokens)
                // Akan berlanjut ke token selanjutnya
            }
        }

        // Tampilkan hasil akhir
        System.out.println("The sum of the integers on this line is " + sum);
    }
}