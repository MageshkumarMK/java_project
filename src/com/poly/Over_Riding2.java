package com.poly;

public class Over_Riding2 extends Over_Riding {
	@Override
	public void mobile_Phone() {
		super.mobile_Phone();
	}

	@Override
	public void mobile_Phone(int ram) {
		super.mobile_Phone(ram);
	}

	@Override
	public void mobile_Phone(String model) {
		super.mobile_Phone(model);
	}

	public static void main(String[] args) {
		Over_Riding2 a = new Over_Riding2();
		a.mobile_Phone();
		a.mobile_Phone(6);
		a.mobile_Phone("3XL");

	}
}
