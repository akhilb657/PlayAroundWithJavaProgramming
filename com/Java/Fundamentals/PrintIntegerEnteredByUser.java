package com.Java.Fundamentals;

import java.util.Scanner;

public class PrintIntegerEnteredByUser {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter an Integer: ");
		int n = obj.nextInt();
		
		System.out.println("Given number: " + n);
	}

}
