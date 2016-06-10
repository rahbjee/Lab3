//Author:  Rahul Bonnerjee
//Date: 06-09-2016
//Purpose:  To calculate the factorial of a user-inputed number
package edu.rahbjee.labexercises;

import java.util.Scanner;

public class Lab4Factorial {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//While loop flag to keep the program running continously until instructed to exit.
		boolean go = true;
		while(go){
			//Prompt the user to enter an integer, which will be used to calculate its factorial.
			System.out.print("Enter an integer greater than 0 but less than 10: ");
			int n = input.nextInt();
			input.nextLine(); //garbage line
			long Factorial = 1; //initializes the factorial variable to 1.
			for (int i=n; i>0; i--) //For loop initializes index, i, to the input then decrements down to 1.
				Factorial *= i; //Each iteration only does one multiplication & reassigns the factorial variable
			System.out.println("The factorial of " + n + " is " + Factorial + ".");
			System.out.println("Go again? (y/n)");
			String again = input.nextLine();
			if (again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no")){
				System.out.println("Goodbye!");
				go = false; //When the user inputs n, or no, the flag is flipped and the loop is exited.
			}
		}
		input.close();
	}
}
