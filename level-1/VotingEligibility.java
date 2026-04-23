import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Define an array of 10 integer elements
        int[] ages = new int[10];

        // Step 2: Take user input for each student's age
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of Student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }

        // Step 3: Loop through the array and check voting eligibility
        System.out.println("\n--- Voting Eligibility Results ---");
        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                // Negative age is invalid
                System.out.println("Student " + (i + 1) + ": Invalid age");

            } else if (ages[i] >= 18) {
                // Age 18 or above can vote
                System.out.println("The student with the age " + ages[i] + " can vote");

            } else {
                // Age below 18 cannot vote
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }

        scanner.close();
    }
}