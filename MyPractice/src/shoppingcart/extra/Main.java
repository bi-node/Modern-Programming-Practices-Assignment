package shoppingcart.extra;

import java.time.LocalDate;


import shoppingcart.Customer;
import shoppingcart.Items;

public class Main {
	public static void main(String[] args) {
		Items it1=new Items("Apples", 10, 3.5);
		Items it2=new Items("Bacon", 6, 2.98);
		Items it3=new Items("Bread", 10, 1.5);
		Items it4=new Items("Pizza", 4, 4.89);
		
		Customer c1=new Customer("Binod Rasaili", LocalDate.now());
		c1.getShoppingCart().addItems(it1);
		c1.getShoppingCart().addItems(it2);
		c1.getShoppingCart().addItems(it3);
		c1.getShoppingCart().addItems(it4);
		
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getDate());
		c1.getShoppingCart().printItems();
		
		
		
		Items it7=new Items("Marshmallow", 5, 2.59);
		Items it9=new Items("Cuc Cakes", 10, 1.99);
		Items it11=new Items("Jelly Beans", 6, 1.09);
		Items it99=new Items("Coke Cola", 2, 0.99);
		
		Customer c2=new Customer("Nino Rasaili", LocalDate.now());
		c2.getShoppingCart().addItems(it7);
		c2.getShoppingCart().addItems(it9);
		c2.getShoppingCart().addItems(it99);
		c2.getShoppingCart().addItems(it11);
		
		System.out.println(c2.getCustomerName());
		System.out.println(c2.getDate());
		c2.getShoppingCart().printItems();
		
		
	
		
		
	}

}
