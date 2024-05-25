package lesson8Functional.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainComparator {
	public static void main(String[] args) {
		List <Employee> listofEmployees=Arrays.asList(
				new Employee("Binod", 700),
				new Employee("Sagar", 600),
				new Employee("Kush", 550),
				new Employee("Suman", 575),
				new Employee("Sagar", 400)
				);
		
		//using comparator
		System.out.println("Using Comparator to sort by salary and then name");
		Collections.sort(listofEmployees,new SalaryComparator());
		System.out.println(listofEmployees);
		
		//using lamdas
		System.out.println("Using landas");
		Collections.sort(listofEmployees, (e1,e2)->Integer.compare(e1.getSalary(), e2.getSalary()));
		System.out.println(listofEmployees);
		
		
	
		
		///or use stream
		List<Employee> sortedEmployees=
		listofEmployees.stream()
		.sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary))
		.collect(Collectors.toList());
		
		System.out.println(sortedEmployees);
	}
	
	
	
  

}
