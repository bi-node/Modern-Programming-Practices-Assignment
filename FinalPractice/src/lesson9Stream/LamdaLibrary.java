package lesson9Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import lesson8Functional.comparator.Employee;

public class LamdaLibrary {
	public static final BiFunction<List<Employee>,String, List<String>> NAMES_STARTS_WITH=
			(list,startwith)->list.stream()
										.map(Employee::getName)
										.filter(x->x.startsWith(startwith))
										.collect(Collectors.toList());
	
	public static void main(String[] args) {
		List <Employee> listofEmployees=Arrays.asList(
				new Employee("Binod", 700),
				new Employee("Sagar", 600),
				new Employee("Kush", 550),
				new Employee("Suman", 575),
				new Employee("Sagar", 400)
				);
		
		
		List<String> list=LamdaLibrary.NAMES_STARTS_WITH.apply(listofEmployees, "S");
		System.out.println(list);
				
	}

}
