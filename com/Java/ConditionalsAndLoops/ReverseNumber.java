package com.Java.ConditionalsAndLoops;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter n:");
		int n = obj.nextInt();
		
		int rev_n = 0;
		int rem;
		
		while(n>0) {
			rem = n%10;
			rev_n = rev_n*10 + rem;
			
			n = n/10;
			
		}
		System.out.println("Reverse of " + n + " is " + rev_n); 

	}
}