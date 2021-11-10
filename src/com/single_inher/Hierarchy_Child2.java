package com.single_inher;

public class Hierarchy_Child2 extends Hierarchy_Parent
{ private void heir_Two() {
System.out.println("python");

} @Override
	public void heir() {
		super.heir();
	}
private void heir_One() {

}public static void main(String[] args) {
	Hierarchy_Child2 a = new Hierarchy_Child2();
	Hierarchy_Child1 b = new Hierarchy_Child1();
	a.heir();
	b.heir_One();
	a.heir_Two();
}
}
