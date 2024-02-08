package com.Java.ConditionalsAndLoops.PrintingName;

import java.util.Scanner;

public class AkhilBoyanapalli {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = obj.nextInt();
		
		
		//FirstName - AKHIL
		for(int i=0;i<n;i++) {
			
			//A
			for(int j=0;j<n;j++) {
				if(i==0&&j>=1&&j<=n-2 ||
					(j==0 || j == n-1) && i>=1 ||
					i==(n-1)/2) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//K
			for(int j=0;j<(n-1)/2 + 1;j++) {
				if(j==0 ||
					i+j == (n-1)/2 ||
					i-j == (n-1)/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//H
			for(int j=0;j<n;j++) {
				if(j==0 ||
					j==n-1 ||
					i==(n-1)/2)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//I
			for(int j=0;j<n;j++) {
				if(j==(n-1)/2 ||
					i==0 ||
					i==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print(" ");
			
			//L
			for(int j=0;j<n;j++) {
				if(j==0 ||
					i==n-1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			
			//System.out.print("     ");
			
			System.out.println(" ");
			
		}
		
		System.out.println();
		System.out.println();
		
		//LastName - BOYANAPALLI
		
		for(int i=0;i<n;i++) {
		//B
		for(int j=0;j<n-2;j++) {
			if((i==0||i==n-1 || i==(n-1)/2)&&j<3*(n-1)/4 ||
				j==0 ||
				j==3*(n-1)/4 && i!=0 && i!=n-1)
			{
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//O
		for(int j=0;j<n-1;j++) {
			if((i==0||i==n-1) && j!=0 && j!=n-2 ||
				(j==0 || j==n-2) && i!=0 && i!= n-1)
			{
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//Y
		for(int j=0;j<n;j++) {
			if(i==j && i<=(n-1)/2 ||
				i+j==n-1)
			{
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//A
		for(int j=0;j<n;j++) {
			if(i==0&&j>=1&&j<=n-2 ||
				(j==0 || j == n-1) && i>=1 ||
				i==(n-1)/2) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//N
		for(int j=0;j<n;j++) {
			if(j==0 ||
				j==n-1 ||
				i==j)
			{
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//A
		for(int j=0;j<n;j++) {
			if(i==0&&j>=1&&j<=n-2 ||
				(j==0 || j == n-1) && i>=1 ||
				i==(n-1)/2) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//P
		for(int j =0; j<n;j++) {
			if(j==0 ||
				(i==0 || i==(n-1)/2) && j<n-1 ||
				j==n-1 && i>0 && i<(n-1)/2) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//A
		for(int j=0;j<n;j++) {
			if(i==0&&j>=1&&j<=n-2 ||
				(j==0 || j == n-1) && i>=1 ||
				i==(n-1)/2) {
				System.out.print("* ");
				}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//L
		for(int j=0;j<n;j++) {
			if(j==0 ||
				i==n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//L
		for(int j=0;j<n;j++) {
			if(j==0 ||
				i==n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print(" ");
		
		//I
		for(int j=0;j<n;j++) {
			if(i==0 ||
				i==n-1 ||
				j==(n-1)/2) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		
		System.out.println(" ");

	}
}
}
