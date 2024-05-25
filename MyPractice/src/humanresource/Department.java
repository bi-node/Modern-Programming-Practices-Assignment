package humanresource;

import java.util.ArrayList;

public class Department {
	String nameDept;
	String location;
	ArrayList<Position> position;
	
	
	public Department(String nameDept, String location) {
		this.nameDept = nameDept;
		this.location = location;
		position=new ArrayList<Position>();
	}


	public void addPosition(Position p)
	{
		position.add(p);
	}
	
	
	
		
	public String getNameDept() {
		return nameDept;
	}


	public String getLocation() {
		return location;
	}


	public void print()
	{
		for(Position pp: position)
		{
			System.out.println("Name: " +pp.getName());
			System.out.println("Salary: "+pp.getSalary());
			pp.print();
		}
		
	}

}
