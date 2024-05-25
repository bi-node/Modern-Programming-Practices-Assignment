package humanresource;

import java.util.ArrayList;

public class Position {
	private String name;
	private double salary;
	ArrayList<Employee> employees;

	public Position(String name, double salary) {

		this.name = name;
		this.salary = salary;
		employees=new ArrayList<Employee>();
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public void addEmployee(Employee e)
	{
		employees.add(e);
	}

	public void print() {
		for(Employee ee: employees)
		{
			
			System.out.println("\t\t\t"+ee.getEmpName());
		
		}

	}

}
