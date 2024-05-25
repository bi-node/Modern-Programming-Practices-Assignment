package shoppingcart;

public class Items {
	private String itemname;
	private double itemPrice;
	private int quantity;
	public Items(String itemname,  int quantity, double itemPrice) {
		this.itemname = itemname;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
