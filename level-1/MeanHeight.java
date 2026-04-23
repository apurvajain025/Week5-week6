import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Create a double array of size 11 for football team players
        double[] heights = new double[11];

        // Step 2: Get height input for each player
        System.out.println("Enter the heights (in cm) of all 11 players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of Player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }

        // Step 3: Find the sum of all elements in the array
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        // Step 4: Calculate and print the mean height
        // Formula: mean = sum of all elements / number of elements
        double meanHeight = sum / heights.length;

        System.out.println("\n--- Football Team Height Analysis ---");
        System.out.println("Total Players : " + heights.length);
        System.out.println("Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height   : " + meanHeight + " cm");

        scanner.close();
    }
}