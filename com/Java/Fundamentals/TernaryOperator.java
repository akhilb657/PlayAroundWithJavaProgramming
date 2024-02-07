package com.Java.Fundamentals;


public class TernaryOperator {

	public static void main(String[] args) {
		int n1 = 99;
		int n2 = 2;
		int n3 = 30;

		int lar = (n1>n2)? (n1>n3?n1:n3) : (n2>n3?n2:n3);

		System.out.println("Largest of 3 numbers is: " + lar);
	}

}
