package com.ucreativa;

public class Waiter {
	
	private StarbucksBuilder mySBBuilder;
	
	public Waiter() {
		
	}

	public void setStarbucksBuilder(StarbucksBuilder aSBBuilder) {
		mySBBuilder = aSBBuilder;
	}
	
	public Starbucks getStarbucksDrink() {
		return mySBBuilder.getStarbucks();
	}
	
	public void constructStarbucks() {
		mySBBuilder.createStarbucks();
		mySBBuilder.buildSize();
		mySBBuilder.buildDrink();
	}
}
