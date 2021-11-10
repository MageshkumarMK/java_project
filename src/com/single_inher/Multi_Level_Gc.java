package com.single_inher;

public class Multi_Level_Gc extends Multi_Level_C {
	private void art_Two() {
		System.out.println("digital art");

	}

	@Override
	public void art() {
		super.art();
	}

	@Override
	public void art_One() {
		super.art_One();
	}

	public static void main(String[] args) {
		Multi_Level_Gc art_List = new Multi_Level_Gc();

		art_List.art();
		art_List.art_One();
		art_List.art_Two();

	}
}
