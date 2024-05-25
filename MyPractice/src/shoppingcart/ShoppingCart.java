package shoppingcart;

import java.time.LocalDate;
import java.util.ArrayList;

public class ShoppingCart {
	private ArrayList<Items> items=new ArrayList<Items>();
	LocalDate date;
	Customer customer;

	ShoppingCart(LocalDate date, Customer customer) {
		
		this.date = date;
		this.customer = customer;
	}

	public void addItems(Items it) {
		items.add(it);
	}

	public ArrayList<Items> getItems() {
		return items;
	}

	public LocalDate getDate() {
		return date;
	}

	public Customer getCustomer() {
		return customer;
	}
	
	public void printItems()
	{
		StringBuilder sb=new StringBuilder();
		System.out.println("Sno.\tItem Name\tQuantity\tPrice\tTotal Amount");
		System.out.println(".............................................................................");
		
		int count=1;
		for(Items it: items)
		{
			sb.append(count++);
			sb.append("\t"+it.getItemname());
			sb.append("\t\t"+it.getQuantity());
			sb.append("\t"+it.getItemPrice());
			sb.append("\t"+Math.floor(it.getQuantity()*it.getItemPrice()));
			sb.append("\n");
		}
		System.out.println(sb.toString());
		System.out.println(".............................................................................");
		System.out.println("\t\tGrand Total: \t\t\t"+Math.floor(getTotal()));
	}
	public double getTotal()
	{
		double total=0;
		for(Items it: items)
		{
			total+=it.getItemPrice()*it.getQuantity();
		}
		return total;
	}

}
