package lesson8Functional.comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainComparable{
	
	public static void main(String[] args) {
		List <Employee> listofEmployees=Arrays.asList(
				new Employee("Binod", 700),
				new Employee("Sagar", 600),
				new Employee("Kush", 550)
				);
		
		Collections.sort(listofEmployees);
		System.out.println(listofEmployees);
		
	
	}

}
