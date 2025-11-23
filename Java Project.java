import java.util.Scanner;

public class assignmentcontentclass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------------------------------
        // Q1: Print Name and Roll Number
        // -------------------------------
        
        System.out.println(" Q1: Name & Roll Number");
        System.out.println("Name: Sarang Dev");
        System.out.println("Roll Number: AA.SC.P2MCA25070094"); // change this to your roll number

        // -------------------------------
        // Q2: Arithmetic Calculator
        // -------------------------------
        
        System.out.println(" Q2: Arithmetic CalculatoR");

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("\nResults:");
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        // -------------------------------
        // Q3: Average of 3 Numbers
        // -------------------------------
        
        System.out.println("Q3: Average of 3 Numbers");

        System.out.print("Enter number 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter number 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter number 3: ");
        double c = sc.nextDouble();

        double average = (a + b + c) / 3;

        System.out.println("Average: " + average);

        // End
       ;
        System.out.println("\nProgram Completed.");
    }
}


//END 