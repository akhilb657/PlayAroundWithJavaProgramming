package com.Java.ConditionalsAndLoops;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = obj.nextInt();
		
		int i=1;
		do {
			System.out.print("*"+ " ");
			i++;
		}while(i<=n);
	}

}
