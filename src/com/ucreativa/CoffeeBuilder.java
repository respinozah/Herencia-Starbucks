package com.ucreativa;

public class CoffeeBuilder extends StarbucksBuilder{

	public CoffeeBuilder(String size) {
		super(size);
	}
	
	@Override
	public void buildSize() {
		//super.myStarbucks.setSize("Large");
	}
	
	@Override
	public void buildDrink() {
		super.myStarbucks.setDrink("Coffee");
	}
}
