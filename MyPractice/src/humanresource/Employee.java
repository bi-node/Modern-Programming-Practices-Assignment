package humanresource;

import java.time.LocalDate;

public class Employee {
	String empName;
	LocalDate birthDate;
	
	public Employee(String empName, LocalDate birthDate) {
		this.empName = empName;
		this.birthDate = birthDate;
	
	}

	public String getEmpName() {
		return empName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}
	
	
	
	

}
