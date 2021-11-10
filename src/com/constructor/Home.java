package com.constructor;

public class Home {
	public Home() {
		System.out.println("default/non-parameterized/noargument constructor");
	}

	public Home(String name, String emailId) {
		System.out.println(name + "\n " + emailId);
	}

	public Home(int er) {
		System.out.println(er);
	}

	public static void main(String[] args) throws Throwable {

	

	Home x= new Home();
	Home y= new Home(99);
	Home z= new Home("mahesh", "maheshkumarbeyahoo.in");
	x.finalize(); 
	y.finalize();
	z.finalize();}
}
