package week1.landlord;

public class Main {
	public static void main(String[] args) {
		
		//first building
		Apartment a1=new Apartment(500);
		Apartment a2=new Apartment(600);
		
		Building b1=new Building(250);
		b1.addAppartment(a1);
		b1.addAppartment(a2);
		
		LandLord landLord=new LandLord();
		
		//second building
		Apartment a3=new Apartment(500);
		Apartment a4=new Apartment(600);
		Apartment a5=new Apartment(900);
		
		Building b2=new Building(850);
		b2.addAppartment(a3);
		b2.addAppartment(a4);
		b2.addAppartment(a5);
		
	
		landLord.addBuildings(b1);
		landLord.addBuildings(b2);
		
		
		System.out.println(landLord.getProfit());
				
	}

}
