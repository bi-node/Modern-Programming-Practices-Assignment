package assignment3.prog2.extra;

import assignment3.prog2.Building;

public class Main {
	public static void main(String[] args) {
		
		Building building=new Building(500);
		building.getApartment().setRent(500);
		building.getApartment().setRent(650);
		building.getApartment().setRent(800);
		building.getApartment().setRent(450);
		//System.out.println(building.getApartment().getRent());
		System.out.println("The total Rent is: "+ building.getTotalRent());
		System.out.println("The total Profit is:" + building.calculateProfit());
		
		
		
		
	}

}
