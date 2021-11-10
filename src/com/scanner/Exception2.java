package com.scanner;

public class Exception2 {   //nullPointerException 
	static String s= null;
	public static void main(String[] args) {
		System.out.println(s);
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
	}

}
