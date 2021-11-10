package com.abstract_class;

public class Partial_Abstraction1 extends Partial_Abstraction {

	@Override
	public void password() {
		System.out.println("sEp@2021");
	}

	public static void main(String[] args) {
		Partial_Abstraction1 a = new Partial_Abstraction1();
		a.userId();
		a.dob();
		a.password();
	}

}
