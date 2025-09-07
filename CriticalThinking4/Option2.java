package CriticalThinking4;

import java.util.Scanner;

public class Option2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        
	        final int NUM_GRADES = 10;
	        double sum = 0.0;
	        double max = Double.NEGATIVE_INFINITY;
	        double min = Double.POSITIVE_INFINITY;

	        System.out.println("Enter " + NUM_GRADES + " grades out of 100:");

	        for (int i = 0; i < NUM_GRADES; i++) {
	            double grade;

	            while (true) {
	                System.out.print("Grade " + (i + 1) + ": ");


	                if (!scanner.hasNextDouble()) {
	                    System.out.println("Invalid input. Please enter a numeric value.");
	                    scanner.next(); // discard invalid input
	                    continue;
	                }

	                grade = scanner.nextDouble();

	                if (grade < 0 || grade > 100) {
	                    System.out.println("Invalid grade. Please enter a value between 0 and 100.");
	                    continue;
	                }

	                break;
	            }

	            sum += grade;

	            if (grade > max) {
	                max = grade;
	            }
	            if (grade < min) {
	                min = grade;
	            }
	        }

	        double average = sum / NUM_GRADES;

	        System.out.println("\n--- Grade Statistics ---");
	        System.out.printf("Average: %.2f%n", average);
	        System.out.printf("Maximum: %.2f%n", max);
	        System.out.printf("Minimum: %.2f%n", min);

	        scanner.close();
	    }
	}