import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Take user input for a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Handle negative numbers by working with absolute value
        int absoluteNumber = Math.abs(number);

        // Step 2: Find the count of digits in the number
        int digitCount = 0;
        int temp = absoluteNumber;

        // If number is 0, it has 1 digit
        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp > 0) {
                digitCount++;
                temp = temp / 10;
            }
        }

        System.out.println("Number of digits: " + digitCount);

        // Step 3: Find the digits in the number and save them in an array
        int[] digits = new int[digitCount];
        temp = absoluteNumber;

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;   // Extract the last digit using modulus
            temp = temp / 10;         // Remove the last digit using division
        }

        // Print the original digits array
        System.out.print("Original digits  : ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();

        // Step 4: Create an array to store the digits in reverse order
        int[] reversedDigits = new int[digitCount];

        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[digitCount - 1 - i];
        }

        // Step 5: Display the elements of the reversed array
        System.out.print("Reversed digits  : ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i] + " ");
        }
        System.out.println();

        // Combine reversed digits into a single reversed number
        int reversedNumber = 0;
        for (int i = 0; i < reversedDigits.length; i++) {
            reversedNumber = reversedNumber * 10 + reversedDigits[i];
        }

        // Apply negative sign if original number was negative
        if (number < 0) {
            reversedNumber = -reversedNumber;
        }

        System.out.println("\nOriginal Number  : " + number);
        System.out.println("Reversed Number  : " + reversedNumber);

        scanner.close();
    }
}