package lesson7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatoriteration {
	public static void main(String[] args) {
		 List<Employee> employeeList = new ArrayList<>();

	        // Populate the list with Employee objects created using constructor
	        employeeList.add(new Employee("John", 50000));
	        employeeList.add(new Employee("Alice", 60000));
	        employeeList.add(new Employee("Bob", 55000));
	        employeeList.add(new Employee("Emily", 58000));
	        employeeList.add(new Employee("David", 62000));
	        employeeList.add(new Employee("Sarah", 54000));
	        employeeList.add(new Employee("Michael", 57000));
	        employeeList.add(new Employee("Emma", 63000));
	        employeeList.add(new Employee("James", 59000));
	        employeeList.add(new Employee("Olivia", 61000));
	        Collections.sort(employeeList,new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					// TODO Auto-generated method stub
					return o1.name.compareTo(o2.name);
				}
	        	
			});
	        for(Employee e:employeeList)
	        	System.out.println(e.getName());

	}

	
	
}

class Employee{
	String name;
	double salary;
	Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}
