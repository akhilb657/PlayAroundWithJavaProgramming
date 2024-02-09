package com.Java.ConditionalsAndLoops;

import java.util.Scanner;

public class PrimeNumbersBetweenTwoIntervals {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter start number:");
		int f = obj.nextInt();
		
		System.out.print("Enter end number: ");
		int l = obj.nextInt();
		
		for(int i=f;i<=l;i++) {
			int c=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					c=c+1;
				}
			}
			if(c==0 && i>1) {
				System.out.print(i + " ");
			}
		}
	}

}
