package com.community.qa;

import java.util.Scanner;

public class Menu {
	Scanner input = new Scanner(System.in);

	public void menu() {
		boolean go = true;
		int num1;
		int num2;
		String choice = "";

		System.out.println("This is the calculator. Press enter to continue.");
		

		while (go) {
			input.nextLine();
			System.out.println("");
			System.out.println("What task would you like to perform?");
			System.out.println("-".repeat(37));
			System.out.println("\t 1- Addition");
			System.out.println("\t 2- Subtraction");
			System.out.println("\t 3- Multiplication");
			System.out.println("\t 4- Division");
			System.out.println("\t 5- Modulus");
			System.out.println("\t 6- Sqaure");
			System.out.println("\t 0- EXIT");
			System.out.println("-".repeat(37));

			choice = this.input.nextLine();

			switch (choice) {
			case "1":
				System.out.println("Enter your first number:");
				num1 = input.nextInt();
				System.out.println("Enter your second number:");
				num2 = input.nextInt();
				System.out.println("The answer is: " + Calculator.add(num1, num2));
				break;
				
			case "2":
				System.out.println("Enter your first number:");
				num1 = input.nextInt();
				System.out.println("Enter your second number:");
				num2 = input.nextInt();
				System.out.println("The answer is: " + Calculator.sub(num1, num2));
				break;
				
			case "3":
				System.out.println("Enter your first number:");
				num1 = input.nextInt();
				System.out.println("Enter your second number:");
				num2 = input.nextInt();
				System.out.println("The answer is: " + Calculator.mul(num1, num2));
				break;
				
			case "4":
				System.out.println("Enter your first number:");
				num1 = input.nextInt();
				System.out.println("Enter your second number:");
				num2 = input.nextInt();
				System.out.println("The answer is: " + Calculator.div(num1, num2));
				break;
				
			case "5":
				System.out.println("Enter your first number:");
				num1 = input.nextInt();
				System.out.println("Enter your second number:");
				num2 = input.nextInt();
				System.out.println("The answer is: " + Calculator.mod(num1, num2));
				break;
				
			case "6":
				System.out.println("Enter the number you want to sqaure:");
				num1=input.nextInt();
				System.out.println("The answer is: " + Calculator.sqaure(num1));
				break;
				
			case "0":
				System.out.println("Exiting the calculator. If you want to return please press enter.");
				break;

			default:
				System.out.println("Inavlid input. Press Enter to continue.");
				break;

			}
		}

	}
}
