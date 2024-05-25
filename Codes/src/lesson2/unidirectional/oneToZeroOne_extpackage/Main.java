package lesson2.unidirectional.oneToZeroOne_extpackage;

import lesson2.unidirectional.oneToZeroOne.*;

public class Main {
	public static void main(String[] args) {
		Customer cust = new Customer("Bob");
		ShoppingCart cart = ShoppingCart.newShoppingCart(cust);
		cart.addItem(new Item("Shirt"));
		System.out.println(
			cust.getCart().getItems());
		
		
	}
	
}

		
