package com.ucreativa;

public abstract class StarbucksBuilder {

	protected Starbucks myStarbucks;
	protected String size;
	
	StarbucksBuilder(String size){
		this.size = size;
		System.out.println("StarbucksBuilder: a new drink builder is created.");
	}
	
	public Starbucks getStarbucks() {
		return myStarbucks;
	}
	
	public void createStarbucks() {
		myStarbucks = new Starbucks();
		myStarbucks.setSize(size);
		
	}
	
	public void buildSize() {
		
	}
	
	public void buildDrink() {
		
	}
}
