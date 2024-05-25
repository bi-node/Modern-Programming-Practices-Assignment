package week1.landlord;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private double totalRent;
	private double maintenanceCost;
	List<Apartment> apartments;
	public Building(double maintenanceCost) {
		// TODO Auto-generated constructor stub
		totalRent=0;
		apartments=new ArrayList<Apartment>();
		this.maintenanceCost=maintenanceCost;
	}
	
	public void addAppartment(Apartment a)
	{
		apartments.add(a);
	}
	
	public double getMaintenance()
	{
		return maintenanceCost;
	}
	
	public double calculateTotalRent()
	{
		for(Apartment ap: apartments)
		{
			totalRent+=ap.getRent();
		}
		return totalRent;
	}

}
