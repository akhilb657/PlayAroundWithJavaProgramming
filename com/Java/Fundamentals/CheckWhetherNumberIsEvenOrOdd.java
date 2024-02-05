package com.Java.Fundamentals;

import java.util.Scanner;

public class CheckWhetherNumberIsEvenOrOdd {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		System.out.print("Enter one number: ");
		int n = obj.nextInt();

		if (n % 2 == 0) {
			System.out.println("Given number is Even");
		}

		else {
			System.out.println("Given number is Odd");
		}

	}

}
