package com.upcasting;

public class Upcasting_Child extends Upcasting_Parent  {
	private void child() {
System.out.println("the child is here");


	}
@Override
public void mymethod() {
	super.mymethod();
}
public static void main(String[] args) {
	Upcasting_Parent a = new Upcasting_Child();
	Upcasting_Child b = new Upcasting_Child();
	b.child();
	a.mymethod();
}
}
