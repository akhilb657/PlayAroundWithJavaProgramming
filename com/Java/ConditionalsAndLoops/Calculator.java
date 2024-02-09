package com.Java.ConditionalsAndLoops;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1 = obj.nextInt();
		
		System.out.print("Enter second number: ");
		int n2 = obj.nextInt();
		
		int res;

		System.out.println("choose appropriate option to do the task: \n"
				+ "1.Addition "
				+ "2.Difference "
				+ "3.Multiply "
				+ "4.Divison");
		int op = obj.nextInt();
		
		switch(op) {
		case 1:
			res = n1+n2;
			System.out.println("Sum of given 2 numbers is: " + res);
			break;
		
		case 2:
			res = n1-n2;
			System.out.println("Differenece of given 2 numbers is: " + res);
			break;
		
		case 3:
			res = n1*n2;
			System.out.println("Product of given 2 numbers is: " + res);
			break;
		
		case 4:
			res = n1/n2;
			System.out.println("Quotient when n1 divides n2 is: " + res);
			break;
		
		default:
			System.out.println("Please enter valid option");
		
			
		}
	}

}
