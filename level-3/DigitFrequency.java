import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Work with absolute value to handle negative numbers
        int absoluteNumber = Math.abs(number);

        // Step 2: Find the count of digits in the number
        int digitCount = 0;
        int temp = absoluteNumber;

        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp > 0) {
                digitCount++;
                temp = temp / 10;
            }
        }

        System.out.println("Number of digits : " + digitCount);

        // Step 3: Find the digits in the number and save them in an array
        int[] digits = new int[digitCount];
        temp = absoluteNumber;

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;    // Extract last digit
            temp = temp / 10;          // Remove last digit
        }

        // Print the digits array
        System.out.print("Digits           : ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // Step 4: Find the frequency of each digit (0-9)
        // frequency[d] stores how many times digit d appears
        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;    // Increment count at index equal to the digit value
        }

        // Step 5: Display the frequency of each digit
        System.out.println("\n--- Frequency of Each Digit in " + number + " ---");
        for (int d = 0; d <= 9; d++) {
            if (frequency[d] > 0) {
                System.out.println("Digit " + d + " appears " + frequency[d]
                        + " time" + (frequency[d] > 1 ? "s" : ""));
            }
        }

        scanner.close();
    }
}