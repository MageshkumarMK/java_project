package com.variables;

public class Variable_One {
	int c = 9;                     // instance variable
	static int d = 8;             // static variable

	 private void var() {
		System.out.println(c);
	}

	static private void var1() {
		System.out.println(d);
	}

	static private void var2() {
		int e=9;                      // local variable
		System.out.println(d + e);
	} public static void main(String[] args) {
		var1();
		var2();
		Variable_One a = new Variable_One ();
		a.var();
	} 

}