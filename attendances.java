package attendd;

import java.util.Scanner;

public class attendances {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
				// TODO Auto-generated method stub
				

				        Scanner sc = new Scanner(System.in);

				        System.out.print("Enter total number of students in the class: ");
				        int totalStudents = sc.nextInt();

				        int[] attendance = new int[30]; 
				        int dayCount = 0;
				        String choice;

				        
				        do {
				            System.out.print("Enter number of students present on Day " + (dayCount + 1) + ": ");
				            attendance[dayCount] = sc.nextInt();
				            dayCount++;

				            if (dayCount >= 30) {
				                System.out.println("Maximum number of days (30) reached.");
				                break;
				            }

				            System.out.print("Do you want to enter attendance for another day? (yes/no): ");
				            choice = sc.next();

				        } while (choice.equalsIgnoreCase("yes"));

				       
				        int totalPresent = 0;
				        int lowAttendanceDays = 0;

				        System.out.println("\n========== ATTENDANCE REPORT ==========");
				        System.out.println("Day\tNumber Present");

				        for (int i = 0; i < dayCount; i++) {
				            System.out.println((i + 1) + "\t" + attendance[i]);
				            totalPresent += attendance[i];

				            if (attendance[i] < (totalStudents / 2)) {
				                lowAttendanceDays++;
				            }
				        }

				        int averageAttendance = totalPresent / dayCount; // rounded to whole number
				        int lowAttendancePercentage = (lowAttendanceDays * 100) / dayCount; // integer percentage

				        System.out.println("--------------------------------------");
				        System.out.println("Average Attendance: " + averageAttendance);
				        System.out.println("Days with Low Attendance (<50%): " + lowAttendanceDays);
				        System.out.println("Low Attendance Percentage: " + lowAttendancePercentage + "%");
				        System.out.println("======================================");

				        sc.close();
				    }
				

			}



