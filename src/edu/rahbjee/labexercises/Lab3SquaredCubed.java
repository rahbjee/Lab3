package edu.rahbjee.labexercises;

import java.util.Scanner;

public class Lab3SquaredCubed {

	public static void main(String[] args) {
			boolean redo = true;
			Scanner input = new Scanner(System.in);
			while(redo){
				System.out.println("Learn your squares and cubes!");
				System.out.println("Enter an integer:");
				int value = input.nextInt();
				System.out.println("Number\tSquared\tCubed");
				System.out.println("=======\t=======\t=====");
				for(int i=1; i<=value;i++)
					System.out.println(i+"\t"+i*i+"\t"+i*i*i);
				System.out.println("Continue? (y/n)");
				input.nextLine();
				String cont = input.nextLine();
				if (cont.equalsIgnoreCase("n")||cont.equalsIgnoreCase("no")){
					System.out.println("Goodbye!");
					redo = false;
				}
			}
			input.close();
	}
}