package com.Java.Fundamentals;

import java.util.Scanner;

public class SwapTwoNumbersWithOutUsingTemporaryVariable {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter one number: ");
		int n1 = obj.nextInt();
		
		System.out.print("Enter another number: ");
		int n2 = obj.nextInt();
		
		System.out.println("Given numbers before swapping: " + n1 + " " + n2);
		
		n1 = n1-n2;
		n2 = n1+n2;
		n1 = n2-n1;
		
		System.out.println("Given numbers after  swapping: " + n1 + " " + n2);

}
}
