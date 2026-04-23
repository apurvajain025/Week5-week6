import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Define arrays for names, ages, and heights of 3 friends
        String[] names  = {"Amar", "Akbar", "Anthony"};
        int[]    ages   = new int[3];
        double[] heights = new double[3];

        // Take user input for age and height of each friend
        System.out.println("========================================");
        System.out.println("   Enter Details for 3 Friends");
        System.out.println("========================================");

        for (int i = 0; i < names.length; i++) {
            System.out.println("\nEnter details for " + names[i] + ":");
            System.out.print("  Age    (in years) : ");
            ages[i] = scanner.nextInt();
            System.out.print("  Height (in cm)    : ");
            heights[i] = scanner.nextDouble();
        }

        // Step 2: Loop through arrays to find the youngest and tallest
        // Assume the first friend is both youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex  = 0;

        for (int i = 1; i < names.length; i++) {

            // Check for youngest (smallest age)
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Check for tallest (greatest height)
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Step 3: Display the youngest and tallest friend
        System.out.println("\n========================================");
        System.out.println("   Results");
        System.out.println("========================================");
        System.out.println("Youngest Friend : " + names[youngestIndex]
                         + " (Age: " + ages[youngestIndex] + " years)");
        System.out.println("Tallest Friend  : " + names[tallestIndex]
                         + " (Height: " + heights[tallestIndex] + " cm)");

        scanner.close();
    }
}