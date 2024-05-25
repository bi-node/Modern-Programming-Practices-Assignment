package week1.landlord;

import java.util.ArrayList;
import java.util.List;

public class LandLord {
	private List<Building> buildings;
	private double totalmc;
	private double totalProfit;
	
	public LandLord() {
		// TODO Auto-generated constructor stub
		buildings=new ArrayList<Building>();
		totalmc=0;
		totalProfit=0;
	}
	
	public void addBuildings(Building b)
	{
		buildings.add(b);
	}
	
	public double calculateMaintenanceCost()
	{
		for(Building bb: buildings)
		{
			totalmc+=bb.getMaintenance();
		}
		return totalmc;
	}
	
public double getProfit()
{
	for(Building bb: buildings)
	{
		totalProfit+=bb.calculateTotalRent();
	}
	
	return totalProfit-calculateMaintenanceCost();
}
	
	

}
