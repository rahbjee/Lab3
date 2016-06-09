//Author: Rahul Bonnerjee
//Date: 06/08/2016

package edu.rahbjee.labexercises;

import java.util.Scanner;

public class Lab3SquaredCubed {

	public static void main(String[] args) {
			//Initialize a boolean variable, which will control the continuity of the while loop.
			boolean redo = true;
			Scanner input = new Scanner(System.in);
			//This while loop will run indefinitely until the user prompts an exit, setting redo to false
			while(redo){
				System.out.println("Learn your squares and cubes!");
				System.out.println("Enter an integer:");
				//The integer that the user inputs is set to an int variable, labeled value.
				int value = input.nextInt();
				System.out.println("Number\tSquared\tCubed");
				System.out.println("=======\t=======\t=====");
				//This for loop will allow the table to be constructed, line by line, until the index is equal to the value
				for(int i=1; i<=value;i++)
					System.out.println(i+"\t"+i*i+"\t"+i*i*i);
				System.out.println("Continue? (y/n)");
				input.nextLine();
				String cont = input.nextLine();
				//Checks to see if the user would like to continue, and if no, the flag (redo) is triggered as false to exit the loop 
				if (cont.equalsIgnoreCase("n")||cont.equalsIgnoreCase("no")){
					System.out.println("Goodbye!");
					redo = false;
				}
			}
			input.close();
	}
}