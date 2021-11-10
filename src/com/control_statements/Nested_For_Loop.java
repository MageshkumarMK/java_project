package com.control_statements;

public class Nested_For_Loop {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {              // outer forLoop
			for (int j = 0; j < 2; j++) {          // inner forLoop
				System.out.println(i+"\n" +j);
			}
		}
	}
}
