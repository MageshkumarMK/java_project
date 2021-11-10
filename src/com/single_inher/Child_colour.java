package com.single_inher;

public class Child_colour extends Parent_colour {
	private void violet() {
		System.out.println("violet has the shortest wavelength");
	}

	@Override
	public void red() {
		super.red();
	}

	public static void main(String[] args) {
		Child_colour x = new Child_colour();
		x.violet();
		x.red();

	}

}
