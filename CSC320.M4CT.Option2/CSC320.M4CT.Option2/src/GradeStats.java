import java.util.Scanner;

public class GradeStats {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants
        int numberOfGrades = 10;

        // Variables
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        // Input grades
        System.out.println("Enter " + numberOfGrades + " grades:");

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); // Consume invalid input
            }
            double grade = scanner.nextDouble();

            // Update sum, max, and min
            sum += grade;
            max = Math.max(max, grade);
            min = Math.min(min, grade);
        }

        // Calculate average
        double average = sum / numberOfGrades;

        // Output statistics
        System.out.println("\nStatistics:");
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // Close the scanner
        scanner.close();
    }
}



