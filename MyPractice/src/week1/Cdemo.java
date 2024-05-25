package week1;

import java.util.ArrayList;
import java.util.List;

class Apartment {
    private double rent;

    public Apartment(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }
}

class Building {
    private List<Apartment> apartments;
    private double maintenanceCost;

    public Building(double maintenanceCost) {
        this.apartments = new ArrayList<>();
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public double calculateProfit() {
        double totalRent = 0;
        for (Apartment apartment : apartments) {
            totalRent += apartment.getRent();
        }
        return totalRent - maintenanceCost;
    }
}

class Landlord {
    private List<Building> buildings;

    public Landlord() {
        buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public double calculateMonthlyTotalProfits() {
        double totalProfit = 0;
        for (Building building : buildings) {
            totalProfit += building.calculateProfit();
        }
        return totalProfit;
    }
}

public class Cdemo {
    public static void main(String[] args) {
        // Create apartments
        Apartment apt1 = new Apartment(1000);
        Apartment apt2 = new Apartment(1200);
        Apartment apt3 = new Apartment(900);

        // Create buildings
        Building building1 = new Building(500);
        Building building2 = new Building(600);

        // Add apartments to buildings
        building1.addApartment(apt1);
        building1.addApartment(apt2);
        building2.addApartment(apt3);

        // Create landlord
        Landlord landlord = new Landlord();

        // Add buildings to landlord
        landlord.addBuilding(building1);
        landlord.addBuilding(building2);

        // Calculate and print total monthly profits
        double totalProfits = landlord.calculateMonthlyTotalProfits();
        System.out.println("Total monthly profits: $" + totalProfits);
    }
}
