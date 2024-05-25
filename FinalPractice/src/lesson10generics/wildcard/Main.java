package lesson10generics.wildcard;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Manager> listofManagers=Arrays.asList(
					new Manager("Binod", 1),
					new Manager("Sagar", 2));
		
	//List<Employee> employees=listofManagers;    //compilation error
	List<? extends Employee> employees=listofManagers;
	System.out.println("The employee list: "+employees);

		
	}

}
