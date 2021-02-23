package com.ucreativa;

public class TeaBuilder extends StarbucksBuilder{

	public TeaBuilder() {
		
	}
	
	@Override
	public void buildSize() {
		super.myStarbucks.setSize("Venti");
	}
	
	@Override
	public void buildDrink() {
		super.myStarbucks.setDrink("Tea");
	}
}
