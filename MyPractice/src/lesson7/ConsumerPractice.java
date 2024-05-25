package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerPractice {
	public static void main(String[] args) {
		List<String> vehicleList = new ArrayList<>();

        // Populate the list with vehicle data
        vehicleList.add("Car: Toyota Camry, Year: 2022, Color: Red");
        vehicleList.add("Truck: Ford F-150, Year: 2023, Color: Blue");
        vehicleList.add("SUV: Honda CR-V, Year: 2021, Color: Silver");
        vehicleList.add("Motorcycle: Harley-Davidson Sportster, Year: 2020, Color: Black");
        vehicleList.add("Van: Dodge Grand Caravan, Year: 2019, Color: White");
        vehicleList.add("Electric Car: Tesla Model S, Year: 2024, Color: Gray");
        vehicleList.add("Hybrid Car: Toyota Prius, Year: 2023, Color: Green");
        vehicleList.add("Pickup Truck: Chevrolet Silverado, Year: 2022, Color: Black");
        vehicleList.add("Bus: Mercedes-Benz Sprinter, Year: 2021, Color: Yellow");
        vehicleList.add("RV: Winnebago Travato, Year: 2020, Color: Beige");
        
        Consumer<String> consumer=new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
				
			}
		};
		
		vehicleList.forEach(consumer);
		
		//using lamda
		System.out.println("Using Lamda");
		vehicleList.forEach(s->System.out.println(s));
		
		
	}

}
