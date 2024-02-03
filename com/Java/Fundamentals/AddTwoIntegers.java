package com.Java.Fundamentals;

import java.util.Scanner;

public class AddTwoIntegers {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1 = obj.nextInt();
		
		System.out.print("Enter second number: ");
		int n2 = obj.nextInt();
		
		int res;
		
		res = n1+n2;
		
		System.out.println("Summation of given two numbers is " + res);
		
	}

}
