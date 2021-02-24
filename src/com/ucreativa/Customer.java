package com.ucreativa;

public class Customer {

	public Customer() {
		
	}
	
	public static void main(String[] args) {
		Customer myCustomer = new Customer();
		Waiter myWaiter = new Waiter();
		
		StarbucksBuilder teaBuilder = new TeaBuilder("Venti");
		Starbucks tea = new Starbucks();
		myWaiter.setStarbucksBuilder(teaBuilder);
		myWaiter.constructStarbucks();
		tea = myWaiter.getStarbucksDrink();
		
		StarbucksBuilder coffeeBuilder = new CoffeeBuilder("Tall");
		Starbucks coffee = new Starbucks();
		myWaiter.setStarbucksBuilder(coffeeBuilder);
		myWaiter.constructStarbucks();
		coffee = myWaiter.getStarbucksDrink();
	}

}
