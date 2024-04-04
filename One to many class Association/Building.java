package assignment3.prog2;

public class Building {
	private Apartment apartment;
	private double maintainance;
	private double totalrent;
	public Building( double maintainance) {
		// TODO Auto-generated constructor stub
		apartment=new Apartment();
		this.maintainance=maintainance;
		totalrent=0;
	}

public Apartment getApartment() {
	 totalrent+=apartment.getRent();
	return apartment;
}

public double getTotalRent()
{
	return totalrent;
}

public double calculateProfit()
{
	return totalrent-maintainance;

}




}
