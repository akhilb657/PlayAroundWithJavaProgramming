package com.Java.ConditionalsAndLoops;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter n:");
		int n = obj.nextInt();
		
		int c=0;
		while(n>0) {
			n=n/10;
			c=c+1;
		}
		System.out.println("Number of digits in given integer is: " + c);
		
	}

}
