package com.examplemcq;

public class Main {
	public static void main(String[] args) {
		try {
			System.out.println("hi");
			newMethod();
			System.out.println("wow");
		} catch (Exception e) {
			System.out.println("oops");
		} finally {
			System.out.println("bye");

		}
	}

	public static void newMethod() {
		throw new Error("demo");
	}
}
