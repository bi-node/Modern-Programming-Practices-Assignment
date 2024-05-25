package lesson8Functional.enumpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EmployeeInfo {
	enum sortMethod{
		BYNAME, BYSALARY;
	}
	public static void main(String[] args) {
		List <Employee> listofEmployees=Arrays.asList(
				new Employee("Binod", 700),
				new Employee("Sagar", 600),
				new Employee("Kush", 550),
				new Employee("Suman", 575),
				new Employee("Sagar", 400)
				);
		//sort by name
		EmployeeInfo.sort(listofEmployees, sortMethod.BYNAME);
		System.out.println(listofEmployees);
		//sort by salary
		EmployeeInfo.sort(listofEmployees, sortMethod.BYSALARY);
		System.out.println(listofEmployees);
		
		
		
	}
	
	public static void sort(List<Employee> list, final sortMethod method)
	{
		Comparator<Employee> com=new Comparator<Employee>() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				if(method==sortMethod.BYNAME)
					return o1.getName().compareTo(o2.getName());
				else return Integer.compare(o1.getSalary(), o2.getSalary());
			}
		};
		Collections.sort(list,com);
	}

}
