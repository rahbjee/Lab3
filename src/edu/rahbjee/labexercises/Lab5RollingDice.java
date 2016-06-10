//Author: Rahul Bonnerjee
//Date: 06-09-2016
//Purpose:  Simulate the rolling variable-sided (entered by user) die.
package edu.rahbjee.labexercises;

import java.util.Scanner;

public class Lab5RollingDice {
	//Initialize the Scanner outside of the main method, so that it may be used in the validation method.
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean go = true; //Create a flag to keep the program running continously until instructed otherwise.
		int n = 1; //Initializes the Roll # to 1 if the user, so it will display Roll 1 if user decides to roll.
		while(go){
			System.out.print("Enter the number of sides would you like: ");
			int sides = checkInt(); //Refers to the validation method to check if an integer was properly input.
			scan.nextLine();
			System.out.print("Go on then!  Would you like have a roll? (y/n): ");
			String roll = scan.nextLine();
			if (roll.equalsIgnoreCase("y") || roll.equalsIgnoreCase("yes")){
				int dice1 = (int) Math.ceil((Math.random()*sides)); //This is the dice rolling calculation.
				int dice2 = (int)Math.ceil((Math.random()*sides)); 
				//Math.random method generates between 0 & 1.  
				//Times by number of sides to get random number between 0-sides-1. 
				//Use ceil method to round up to get numbers between 1-sides.
				//Finally wrap as an int so the dice variable can accept the result.
				System.out.println("Roll " + n + ":");
				System.out.println(dice1);
				System.out.println(dice2); //Print out the roll results.
				System.out.print("Roll again? (y/n) ");
				String again = scan.nextLine();
				if (again.equalsIgnoreCase("n") || again.equalsIgnoreCase("no")){
					go = false;  //if user wishes to exit
				} else if (again.equalsIgnoreCase("y")||again.equalsIgnoreCase("yes")) {
					n++; //Increment the Roll # & continue in the while loop.
					continue;
				} else {
					System.out.println("Improper input. Please limit your answer to yes or no (y/n): "); //Yell at user, but continue anyways..
				}
			} else if (roll.equalsIgnoreCase("n")||roll.equalsIgnoreCase("no")) {
				go = false; //flip flag as user requests to exit the program.
			} else {
				System.out.println("Improper input. Please limit your answer to yes or no (y/n): ");
			}
		}
		scan.close();
		System.out.println("Goodbye!");
	}
	
	public static int checkInt() {
		// Initialize the checking variable
		int correctInt = 0;
		// So while the input is not (!) a integer type, it will ask you to re enter
		while(!scan.hasNextInt()){
			System.out.println("That is not a valid input!  Please enter an integer data type.");
			scan.next();
		}
		correctInt = scan.nextInt();
		return correctInt;
		}
	
}