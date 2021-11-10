package com.poly;

public class Over_Loading {
	private void card_Details(String name, String name2) {
		System.out.println(name + "\n" + name2);

	}

	private void card_Details(long cardnumber, long cardnumber2) {
		System.out.println(cardnumber + "\n" + cardnumber2);

	}

	public static void main(String[] args) {
		Over_Loading z = new Over_Loading();
		z.card_Details("Mahesh", "Naveen");
		z.card_Details(6522, 123456);
		z.card_Details("m", "m");

	}

}
