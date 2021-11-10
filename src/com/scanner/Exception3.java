package com.scanner;

public class Exception3 { // ExceptionHandling
	public static void main(String[] args) {
		int a = 145;
		try {                           //surroundwith tryAndcatch
			System.out.println(a / 0); // substitute 0 with any numbers
		} catch (Exception e) {
			System.out.println("process");
			e.printStackTrace();
		}
		finally {      // finallyBlock
			System.out.println("completed");
		}
	}
}
