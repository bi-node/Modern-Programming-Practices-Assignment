package shoppingcart;

import java.time.LocalDate;

public class Customer {
	private String customerName;
	LocalDate date;
	ShoppingCart shoppingCart;
		
	public Customer(String customerName, LocalDate date) {
		this.customerName = customerName;
		this.date = date;
		shoppingCart=new ShoppingCart(date, this);
	}

	public ShoppingCart getShoppingCart()
	{
		return shoppingCart;
	}

	public String getCustomerName() {
		return customerName;
	}

	public LocalDate getDate() {
		return date;
	}

}
