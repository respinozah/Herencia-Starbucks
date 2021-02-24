package com.ucreativa;

public class TeaBuilder extends StarbucksBuilder{

	public TeaBuilder(String size) {
		super(size);
	}
	
	@Override
	public void buildSize() {
		//super.myStarbucks.setSize("Venti");
	}
	
	@Override
	public void buildDrink() {
		super.myStarbucks.setDrink("Tea");
	}
}
