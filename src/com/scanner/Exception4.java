package com.scanner;

public class Exception4 {
	public static void main(String[] args) {
		int a = 145;
		try {
			try {
				System.out.println(a / 0);
			} catch (Exception e) {
				System.out.println(a);
				e.printStackTrace();
			}
			System.out.println(123 / 0);
		} catch (Exception e) {
			System.out.println("process 2 not completed");
			e.printStackTrace();
		}
	}

}