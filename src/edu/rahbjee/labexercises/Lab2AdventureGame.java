//Author:  Rahul Bonnerjee
//Date: 06-08-2016
//Purpose:  Lab 2 takes us on the adventure of a typical Saturday in Detroit.  What should we do?!

package edu.rahbjee.labexercises;

import java.util.Scanner;

public class Lab2AdventureGame {

	public static void main(String[] args) {
		//Initialize the Scanner
		Scanner input = new Scanner(System.in);
		System.out.print("Hey!  What can I call you? (enter your name): ");
		//First input will be saved into the String variable, name.
		String name = input.nextLine();
		System.out.println("Nice to meet you " + name + ". Would you like to hang on Saturday? (enter 'yes' or 'no'):");
		boolean inputWrong = true;
		while(inputWrong){
			String start = input.nextLine();
			if (start.equalsIgnoreCase("yes") ||  start.equalsIgnoreCase("y")){
				System.out.println("Awesome, where would you like to go? (Pick a path by entering the corresponding number):");
				System.out.println("1. Eastern Market");
				System.out.println("2. Downtown");
				int path = input.nextInt();
					switch (path){
						case 1:
							System.out.println("Great! There's a lot to do in Eastern Market on Saturdays");
							System.out.println("What would you like to do first? (Pick another path via number)");
							System.out.println("1. Go to the Farmers Market");
							System.out.println("2. Bike down the Dequindre Cut");
							int path2 = input.nextInt();
							switch (path2) {
								case 1:
									System.out.println("What a beautiful day in the market!  \nThere are many farmers & businesses selling many things.  What would you like to browse? (enter corresponding number):");
									System.out.println("1. Produce from Grown in Detroit");
									System.out.println("2. Salsa from Aunt Nee's");
									System.out.println("3. Soup from Russell Street Deli");
									int path3 = input.nextInt();
									switch (path3) {
										case 1:
											System.out.println("What an amazing harvest!  Way to support your local farmer.");
											System.out.println("While browsing the rest of the market you run into your friends!");
											break;
										case 2:
											System.out.println("Best salsa in town made by my good friend Carlos!");
											System.out.println("Carlos tells us that his guacamole already sold out by 10am!.");
											break;
										case 3:
											System.out.println("I love Russell Street Deli soup!  It's good for your soul.");
											System.out.println("The man managing the soup stand is the opposite of the soup nazi, and gives us a sample of every soup.");
											break;
										default:
											System.out.println("Unrecognized input.  Game Over!");
											break;
									}
									break;
								case 2:
									System.out.println("Beautiful day for a bike ride!  Let's go to the Riverfront!");
									System.out.println("Incredible view!  and the breeze from the river feels so good.");
									break;
								default:
									System.out.println("Unrecognized input.  Sorry but the game is over!");
								}
							break;
						case 2:
							System.out.println("There is so much going on Downtown!  What would you like to do?");
							System.out.println("Make your choice by entering the corresponding number:");
							System.out.println("1. Hang out in Campus Martius");
							System.out.println("2. Go to the Movement festival at Hart Plaza");
							int path4 = input.nextInt();
							switch (path4) {
								case 1:
									System.out.println("Busy day at Campus Martius.  \nWould you like to.. (again enter the corresponding number):");
									System.out.println("1. Play basketball");
									System.out.println("2. Hang out at the beach bar");
									int path5 = input.nextInt();
									switch (path5) {
										case 1:
											System.out.println("Great game!  You beat me fair & square in a game of 1 on 1.  Nicely done!");
											break;
										case 2:
											System.out.println("Let's bury our barefeet in the sand.");
											System.out.println("After a couple of drinks you're feeling very relaxed");
											break;
										default:
											System.out.println("Unrecognized input.  Please only enter the available numbers. Game over.");
											break;
									}
								break;
								case 2:
									System.out.println("Woah, it's really loud & quite expensive.  Would you still like to go? (y/n)");
									String go = input.nextLine();
									if (go.equalsIgnoreCase("y") || go.equalsIgnoreCase("yes")){
										System.out.println("Uhn Tsss Uhn Tss!  What a party!!  Let's dance the day away...");
									} else {
										System.out.println("That's cool.  Let's go home then.");
									}
								break;
							}
							break;
					}
				System.out.println("A couple of hours pass..");
				System.out.println("Well it's been a wonderful day " + name + ".  \nBut I'm going to need to nap soon.  It was very nice to meet & spend some time with you!");
				inputWrong = false;
			}
			else if (start.equalsIgnoreCase("no") || start.equalsIgnoreCase("n")){
				System.out.println("Ok.  Hope you have a nice day!  Bye!");
				inputWrong = false;
			}
			else{
					System.out.println("Sorry couldn't understand. Please limit your answer to yes or no (y/n)");
			}
		}
	input.close();
	}
}