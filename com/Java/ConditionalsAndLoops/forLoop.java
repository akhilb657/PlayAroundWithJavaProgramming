package com.Java.ConditionalsAndLoops;

import java.util.Scanner;

public class forLoop {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = obj.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.print(i + " ");
		}
	}

}
