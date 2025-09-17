package grad.com;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

		        int totalStudents = 0;
		        int passCount = 0;
		        int failCount = 0;

		        while (true) {
		            System.out.print("Enter student marks (0-100) or -1 to stop: ");
		            int marks = sc.nextInt();

		            // Sentinel value to exit loop
		            if (marks == -1) {
		                break;
		            }

		            // Validate input
		            if (marks < 0 || marks > 100) {
		                System.out.println("Invalid marks! Please enter between 0 and 100.");
		                continue;
		            }

		            totalStudents++; // Count this student

		            // Determine grade and print immediately
		            if (marks >= 80) {
		                System.out.println("Grade: A");
		                passCount++;
		            } else if (marks >= 70) {
		                System.out.println("Grade: B");
		                passCount++;
		            } else if (marks >= 60) {
		                System.out.println("Grade: C");
		                passCount++;
		            } else if (marks >= 50) {
		                System.out.println("Grade: D");
		                passCount++;
		            } else {
		                System.out.println("Grade: F");
		                failCount++;
		            }
		        }

		        // Calculate pass rate
		        double passRate = 0;
		        if (totalStudents > 0) {
		            passRate = ((double) passCount / totalStudents) * 100;
		        }

		        // Print summary report
		        System.out.println("\n========== SUMMARY REPORT ==========");
		        System.out.println("Total Students: " + totalStudents);
		        System.out.println("Passed: " + passCount);
		        System.out.println("Failed: " + failCount);
		        System.out.println("Pass Rate: " + passRate + "%");
		        System.out.println("===================================");

		        sc.close();
		    }
		


	}

