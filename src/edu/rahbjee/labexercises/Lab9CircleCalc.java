package edu.rahbjee.labexercises;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab9CircleCalc {
	
	private double radius;
	private static int count = 0;
	
	//Constructor
	public Lab9CircleCalc(double r) {
		radius = r;
		count++;
	}
	
	//Getters & Accessors
	public double getRadius(){
		return radius;
	}

	public double getCircumference(){
		return radius * 2 * Math.PI;
	}
	
	public double getArea(){
		return (radius * radius) * Math.PI;
	}
	
	public String getFormattedCircumference(){
		return formatNumber(getCircumference());
	}
	
	
	public String getFormattedArea(){
		return formatNumber(getArea());
		
	}
	
	public static int getObjectCount(){
		return count;
	}

	private String formatNumber(double x){
		BigDecimal num = new BigDecimal(x);
		num.setScale(2, RoundingMode.HALF_UP);
		return String.format("%.2f", num);
	}
	
	//Setters & Mutators
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the Circle Tester");
			boolean cont = true;
			
			while(cont){
				System.out.print("Enter radius: ");
				double radius = scan.nextDouble();
				Lab9CircleCalc circle = new Lab9CircleCalc(radius);
				System.out.print("Circumference: " + circle.getFormattedCircumference() + "\n");
				System.out.print("Area: " + circle.getFormattedArea() + "\n");
				System.out.print("Continue? (y/n): " );
				scan.nextLine();
				String again = scan.nextLine();
				boolean cont2 = true;
				while(cont2)	{
					if (again.equalsIgnoreCase("n") ||again.equalsIgnoreCase("no")){
						cont = false;
						cont2 = false;
					}else if (again.equalsIgnoreCase("y")||again.equalsIgnoreCase("yes")){
						cont2 = false;
						continue;
					}else{
						System.out.println("Please only enter \"yes\" or \"no\" (y/n).");
						again = scan.nextLine();
					}
				}
						
			}
			System.out.println("Goodbye.  You created " + count + " Circle object(s).");
			scan.close();
		} catch (InputMismatchException e) {
			System.err.println("Invalid input.  Please enter the right data type.");
		}
	}

}
