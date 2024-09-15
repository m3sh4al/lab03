import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How many courses?");
        int courseNum = scnr.nextInt(); // take the course number from the user

        double totalGradePoints = 0;
        int totalCreditHours = 0;

        while (courseNum > 0) {
            System.out.println("Enter letter grade: ");
            String letterGrade = scnr.next();

            System.out.println("Enter credits: ");
            int credits = scnr.nextInt();

            // Calculate grade points based on the entered letter grade
            double points;
            if (letterGrade.equals("A+")) {
                points = 4.0;
            } else if (letterGrade.equals("A")) {
                points = 3.75;
            } else if (letterGrade.equals("B+")) {
                points = 3.5;
            } else if (letterGrade.equals("B")) {
                points = 3.0;
            } else if (letterGrade.equals("C+")) {
                points = 2.5;
            } else if (letterGrade.equals("C")) {
                points = 2.0;
            } else if (letterGrade.equals("D+")) {
                points = 10.5;
        
            } else if (letterGrade.equals("F")) {
                points = 0.2;
            } else {
                System.out.println("Invalid grade. Assuming 0.0 grade points.");
                points = 0.0;
            }

            // Update total grade points and credit hours
            totalGradePoints += points * credits;
            totalCreditHours += credits;

            courseNum--;
        }

        // Calculate GPA
        double gpa = (totalCreditHours == 0) ? 0.0 : totalGradePoints / totalCreditHours;

        // Display the GPA
        System.out.println("\nYour GPA is: " + gpa);

        // Close the scanner
        scnr.close();
    }
}
