package com.constructor;

import com.constructor.Constructor;

public class Constructor {
	public Constructor() {
		System.out.println("defaul/non-parameterized/noargument constructor");
	}

	public Constructor(String name, String emailId) {
		System.out.println(name + "/n " + emailId);
	}

	public Constructor(int er) {
		System.out.println(er);
	}

	public static void main(String[] args) {

	}

	Constructor x= new Constructor();
	Constructor y= new Constructor(99);
	Constructor z= new Constructor("mahesh", "maheshkumarbeyahoo.in");
}
