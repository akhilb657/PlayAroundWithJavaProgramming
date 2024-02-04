package com.Java.Fundamentals;

import java.util.Scanner;

public class ComputeQuotientAndRemainder {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter numerator: ");
		int numerator = obj.nextInt();
		
		System.out.print("Enter denominator: ");
		int denominator = obj.nextInt();
		
		int quotient;
		int remainder;
		
		quotient = numerator/denominator;
		
		remainder = numerator%denominator;
		
		System.out.println("Quotient when " + numerator + " divides " + denominator + " is " + quotient);
		
		System.out.println("Remainde when " + numerator + " divides " + denominator + " is " + remainder);
	}

}
