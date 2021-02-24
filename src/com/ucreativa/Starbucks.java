package com.ucreativa;

public class Starbucks {

	private String size;
	private String drink;
	
	public Starbucks() {
		System.out.println("Starbucks: new drink instance is created.");
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setDrink(String drink) {
		this.drink = drink;
	}
}
