package com.Java.ConditionalsAndLoops;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = obj.nextInt();
		
		int temp=n;
		int temp2=n;
		
		//to know number of digits
		int c=0;
		while(temp>0) {
			temp=temp/10;
			c=c+1;
			
		}
		
		if (c==1) {
			System.out.println("Given number is not an Armstrong number");
		}
		
		else {
		//processing
		int s = 0;
		int rem;
		while(n>0) {
			rem = n%10;
			s = s + (int) Math.pow(rem, c);
			n=n/10;
		}
		//System.out.println(s);
		
		if(temp2==s) {
			System.out.println("Given number is Armstrong");
		}
		else {
			System.out.println("Given number is not Armstrong");
		}
	}
	}
	

}
