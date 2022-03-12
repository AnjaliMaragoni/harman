//Q2. Write a program called GradesAverage, which prompts user for the number of students, reads it from the keyboard, 
//and saves it in an int variable called numStudents. It then prompts user for the grades of each of 
//the students and saves them in an int array called grades. Your program shall check that the grade is between 0 and 100. 
//A sample session is as follow:
//
//Enter the number of students: 3 
//Enter the grade for student 1: 55 
//Enter the grade for student 2: 108 
//Invalid grade, try again...
//Enter the grade for student 2: 56 
//Enter the grade for student 3: 57 
//The average is: 56.0

package assignment1;

import java.util.Scanner;

public class averageGrade {
	public static void main(String[] agrs){
		double sum = 0;
		System.out.print("Enter the number of student: ");
		Scanner sc = new Scanner(System.in);
		int numStudent = sc.nextInt();
		int[] grades = new int[numStudent];
		int i= 0;
		while (i < numStudent) {
			System.out.print("Enter the grade for student "+(i+1)+":");
			grades[i] =  sc.nextInt();
			if (grades[i] <0 || grades[i] > 100) {
				System.out.println("invalid grade, try again...");
				
			}
			else {
				sum += grades[i];
				i++;
				
			}
			
		}
		System.out.println("The average is:"+sum / numStudent);
		
		
	}

}
