import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Define arrays for salary, years of service, bonus, and new salary
        double[] salary         = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus          = new double[10];
        double[] newSalary      = new double[10];

        // Variables to store totals
        double totalBonus     = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Step 2: Loop to take input from user with validation
        System.out.println("========================================");
        System.out.println("   Enter Details for 10 Employees");
        System.out.println("========================================");

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");

            // Validate salary input
            System.out.print("  Enter Salary             : ");
            salary[i] = scanner.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("  Invalid salary! Please enter a positive value.");
                i--;  // Decrement index to re-enter this employee's data
                continue;
            }

            // Validate years of service input
            System.out.print("  Enter Years of Service   : ");
            yearsOfService[i] = scanner.nextDouble();
            if (yearsOfService[i] < 0) {
                System.out.println("  Invalid years of service! Please enter a non-negative value.");
                i--;  // Decrement index to re-enter this employee's data
                continue;
            }
        }

        // Step 3: Loop to calculate bonus, new salary, and totals
        System.out.println("\n========================================================");
        System.out.println("   Employee Bonus Details");
        System.out.println("========================================================");
        System.out.printf("%-10s %-12s %-10s %-10s %-12s%n",
                "Employee", "Old Salary", "Service", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < 10; i++) {

            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 5 / 100;    // 5% bonus
            } else {
                bonus[i] = salary[i] * 2 / 100;    // 2% bonus
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Accumulate totals
            totalBonus     += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];

            // Print individual employee details
            System.out.printf("%-10s %-12.2f %-10.1f %-10.2f %-12.2f%n",
                    "Emp " + (i + 1), salary[i], yearsOfService[i], bonus[i], newSalary[i]);
        }

        // Step 4: Print totals
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-10s %-10.2f %-12.2f%n",
                "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
        System.out.println("========================================================");

        System.out.println("\n--- Summary ---");
        System.out.println("Total Old Salary Payout : " + totalOldSalary);
        System.out.println("Total Bonus Payout      : " + totalBonus);
        System.out.println("Total New Salary Payout : " + totalNewSalary);

        scanner.close();
    }
}