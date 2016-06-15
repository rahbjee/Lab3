//Author: Rahul Bonnerjee
//Date: 06-13-2016
//Purpose:  Practice using Try-Catch statements to handle exceptions
package edu.rahbjee.labexercises;

import java.util.Scanner;

public class Lab7StudentInfo {

	public static void main(String[] args) throws IllegalArgumentException {

		//Create a set of parallel String arrays with students' info: names, hometown, and favorite foods.
		String [] students = {"Rahul Bonnerjee","Jonathan Abdo","Ashish Mishra","Hussein Ibrahim","Raphael Gebre-Egziabher"};
		String [] hometown = {"Detroit, MI", "Detroit, MI","Detroit, MI","Beirut, Lebanon","Detroit, MI"};
		String [] favFood = {"Indian","Mexican","Chinese","Mediterrean","Italian"};
		System.out.println("Welcome to the June cohort of the Java Bootcamp here at Grand Circus.");
		// Construct a scanner object to read input
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		while(cont){
			try {
				System.out.print("Please enter an integer between 1-5 to learn about a select group of our students: ");
				int student = input.nextInt();
				input.nextLine();
				int studID = student -1;
				System.out.println("Student " + student + ": " + students[studID]);
				System.out.println("What would you like to learn about " + students[studID] + "? (enter \"favorite food\" or \"hometown\"):");
				String info = input.nextLine();
				if (info.equalsIgnoreCase("hometown"))
					System.out.print(students[studID] + " is from " + hometown[studID] + ".");
				else if (info.equalsIgnoreCase("favorite food")) 
					System.out.print(students[studID] + "'s favorite food is " + favFood[studID] +".");
				else
					throw new IllegalArgumentException();
				System.out.println("  Would you like to know more about our class?  (enter \"yes\" or \"no\"):");
				String again = input.nextLine();
				if (again.equalsIgnoreCase("n")||again.equalsIgnoreCase("no")){
					cont = false;
				}else if (again.equalsIgnoreCase("y")||again.equalsIgnoreCase("yes")) {
					continue;
				}else{
					throw new IllegalArgumentException();
				}
			} catch (IndexOutOfBoundsException e) {
				System.err.println("Data on that student does not exist.  Please try again. (enter a number between 1-5):");
				System.out.println();
			} catch (IllegalArgumentException e) {
				System.err.println("Unexpected input.  Please enter exactly what is suggested by the prompt");
				System.out.println();
			}
		}
		System.out.println("Thank you for learning about our class.  Goodbye!");
		input.close();
	}

}
