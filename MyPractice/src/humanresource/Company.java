package humanresource;

import java.util.ArrayList;
import java.util.Iterator;

public class Company {
	String nameofC;
	ArrayList<Department> department;
	
	public Company(String nameofC)
	{
		this.nameofC=nameofC;
		department=new ArrayList<Department>();
	}
	
	public void addDepartment(Department d)
	{
		department.add(d);
	}
	
	

	public void print() {
		for(Department dd: department)
		{
			System.out.println("Department Name: "+dd.getNameDept());
			dd.print();
		}
		
			
		
	}

}
