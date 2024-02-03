package com.Java.Fundamentals;

import java.util.Scanner;

public class MultiplyTwoFloatingPointNumbers {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter 1st floating number: ");
		float f1 = s.nextFloat();
		
		System.out.print("Enter 2nd floating number: ");
		float f2 = s.nextFloat();
		
		float mul;
		
		mul = f1 * f2;
		
		System.out.println("Multiplication of two floating point nummbers is " + mul);
	}

}
