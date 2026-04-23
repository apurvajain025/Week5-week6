import java.util.Scanner;

public class MultiplicationTableArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Get integer input and define array to store results
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] multiplicationTable = new int[10];

        // Step 2: Run a loop from 1 to 10 and store results in the array
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Step 3: Display the results from the array
        System.out.println("\nMultiplication Table of " + number + ":");
        System.out.println("------------------------------");
        for (int i = 1; i <= multiplicationTable.length; i++) {
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }

        scanner.close();
    }
}