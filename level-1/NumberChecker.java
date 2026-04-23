import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Define an integer array of 5 elements
        int[] numbers = new int[5];

        // Step 2: Take user input for 5 numbers
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Loop through the array and check each number
        System.out.println("\n--- Number Analysis ---");
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                // Number is positive — check even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }

            } else if (numbers[i] < 0) {
                // Number is negative
                System.out.println(numbers[i] + " is Negative");

            } else {
                // Number is zero
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Step 4: Compare the first and last elements of the array
        System.out.println("\n--- Comparison: First vs Last Element ---");
        int first = numbers[0];
        int last  = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("The first element " + first + " and the last element " + last + " are Equal");
        } else if (first > last) {
            System.out.println("The first element " + first + " is Greater than the last element " + last);
        } else {
            System.out.println("The first element " + first + " is Less than the last element " + last);
        }

        scanner.close();
    }
}