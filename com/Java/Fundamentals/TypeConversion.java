package com.Java.Fundamentals;

public class TypeConversion {
	
	public static void main(String[] args) {
		byte a = 45;//1 byte
		double b;// 8 bytes
		b=a;//implicit typeCasting
		System.out.println(b);
		
		float f = 45.9f;//4 bytes
		byte b1;//1 byte
		b1=(byte)f;//explicit typeCasting
		System.out.println(b1);
		
	}

}
