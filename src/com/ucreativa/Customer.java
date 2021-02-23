package com.ucreativa;

public class Customer {

	public Customer() {
		
	}
	
	public static void main(String[] args) {
		Customer myCustomer = new Customer();
		Waiter myWaiter = new Waiter();
		StarbucksBuilder coffeeBuilder = new CoffeeBuilder();
		StarbucksBuilder teaBuilder = new TeaBuilder();
		Starbucks tea = new Starbucks();
		Starbucks coffee = new Starbucks();
		
		myWaiter.setStarbucksBuilder(teaBuilder);
		myWaiter.constructStarbucks();
		tea = myWaiter.getStarbucksDrink();
		
		myWaiter.setStarbucksBuilder(coffeeBuilder);
		myWaiter.constructStarbucks();
		coffee = myWaiter.getStarbucksDrink();
	}

}
