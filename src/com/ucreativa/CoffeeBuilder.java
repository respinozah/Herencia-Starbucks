package com.ucreativa;

public class CoffeeBuilder extends StarbucksBuilder{

	public CoffeeBuilder() {
		
	}
	
	@Override
	public void buildSize() {
		super.myStarbucks.setSize("Venti");
	}
	
	@Override
	public void buildDrink() {
		super.myStarbucks.setDrink("Coffee");
	}
}
