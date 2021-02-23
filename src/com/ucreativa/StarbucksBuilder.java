package com.ucreativa;

public abstract class StarbucksBuilder {

	protected Starbucks myStarbucks;
	
	StarbucksBuilder(){
		
	}
	
	public Starbucks getStarbucks() {
		return myStarbucks;
	}
	
	public void createStarbucks() {
		myStarbucks = new Starbucks();
		
	}
	
	public void buildSize() {
		
	}
	
	public void buildDrink() {
		
	}
}
