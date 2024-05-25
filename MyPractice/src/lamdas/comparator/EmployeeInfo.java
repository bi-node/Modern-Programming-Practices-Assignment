package lamdas.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
	public enum sortType{
		BYNAME, BYSALARY;
	}
	
	
	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Rabin", 50000));
		emps.add(new Employee("Andy", 60000));
		
		Comparator<Employee> sortingComparator=EmployeeInfo.sorting(emps, sortType.BYNAME);
		Collections.sort(emps, sortingComparator);
		System.out.println("Sorting by Name: "+ emps);
		
	 sortingComparator=EmployeeInfo.sorting(emps, sortType.BYSALARY);
		Collections.sort(emps, sortingComparator);
		System.out.println("Sorting by Salary: "+ emps);
		
		sortType method=sortType.BYNAME;
		
		//or using lamdas closure
		Collections.sort(emps, (e1,e2)->{
			if(method==sortType.BYNAME)
			{
				return e1.name.compareTo(e2.name);
			}
			else {
				if(e1.salary==e2.salary) return 0;
				else if(e1.salary<e2.salary) return -1;
				else return 1;
			}
		});
		System.out.println("Using closure lamda ");
		System.out.println(emps);
		
		
	}
	
	public static Comparator<Employee> sorting(List<Employee> emplist, sortType method)
	{
		Comparator<Employee> comparator=(e1,e2)->{
			if(method==sortType.BYNAME)
			{
				return e1.name.compareTo(e2.name);
			}
			else {
				if(e1.salary==e2.salary) return 0;
				else if(e1.salary<e2.salary) return -1;
				else return 1;
			}
			
		};
		return comparator;
	}
}
