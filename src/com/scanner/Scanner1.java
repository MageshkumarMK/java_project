package com.scanner;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner a= new Scanner (System.in);
		String Line =a.nextLine();
		System.out.println("Name:" +Line);
		String next = a.next();
		System.out.println("First name:" +next);
		int nextInt = a.nextInt();
		System.out.println("id:"+nextInt);
		
	}

}
