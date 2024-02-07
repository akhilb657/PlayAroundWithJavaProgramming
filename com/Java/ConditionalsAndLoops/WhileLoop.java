package com.Java.ConditionalsAndLoops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
	
		System.out.print("Enter n: ");
		int n = obj.nextInt();
		
		int i=1;
		
		while(i<=n) {
			System.out.print(i + " ");
			i++;
		}

}
}
