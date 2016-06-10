// Rahul Bonnerjee
// 06-06-2016
// This program analyzes dimensions of a room, input by the user, and calculates the area, perimeter, and volume.
package edu.rahbjee.labexercises;

import java.util.Scanner;

public class Lab1 {
	// Initialize Scanner
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Initialize the values length, width, and height.
		double length;
		double width;
		double height;
		while (true) {
			System.out.print("Enter the length: ");
			length = checkDouble();
			System.out.print("Enter the width: ");
			width = checkDouble();
			System.out.print("Enter the height: ");
			height = checkDouble();
			double area = length*width;
			double perimeter = 2*(length+width);
			double volume = length*width*height;
			System.out.println("Area: " + area);
			System.out.println("Perimeter: " + perimeter);
			System.out.println("Volume: " + volume);
			System.out.println("Would you like the program to continue? (Y/N)");
			input.nextLine(); // Creates blank space to allow Scanner to move to next Line
			String again = input.nextLine();
			if (again.equals("N") || again.equals("n") || again.equals("No") || again.equals("no")) {
				break;
			}
		}
		input.close();
	}


	public static double checkDouble() {
	// Initialize the checking variable
	double correctDouble = 0;
	// So while the input is not (!) a double type, it will ask you to re eneter 
	while(!input.hasNextDouble()){
		System.out.println("That is not a valid input!  Please enter a double data type.");
		input.next();
	}
	correctDouble = input.nextDouble();
	return correctDouble;
	}
}