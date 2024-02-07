package com.Java.Fundamentals;

import java.util.Scanner;

public class AlphabetIsVowelOrConsonant {
	
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the character: ");
		char c = obj.next().charAt(0);
		
		if(c=='a' || c=='e' || c=='i' || c== 'o' || c=='u' ||
		   c== 'A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println("Give character is Vowel");
		}
		else {
			System.out.println("Give Character is Consonant");
		}
		
	}

}
