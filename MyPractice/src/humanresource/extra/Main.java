package humanresource.extra;
import java.time.LocalDate;

import humanresource.*;

public class Main {
	public static void main(String[] args) {
		Employee emp1=new Employee("Binod Rasaili", LocalDate.of(1984, 11, 8));
		Employee emp2=new Employee("Sagar Maharjan", LocalDate.of(1984, 11, 8));
		Employee emp3=new Employee("Anoj Kumar Shrestha", LocalDate.of(1984, 11, 8));
		Employee emp4=new Employee("Kush Raj Rimal", LocalDate.of(1984, 11, 8));
		Employee emp5=new Employee("Aang", LocalDate.of(1984, 11, 8));
		Employee emp6=new Employee("Suman Adhikari", LocalDate.of(1984, 11, 8));
		
				
		Position manager = new Position("Manager", 50000);
        Position engineer = new Position("Software Engineer", 60000);
        Position sectionOfficer=new Position("Section Office", 80000);
        
        manager.addEmployee(emp1);
        sectionOfficer.addEmployee(emp2);
        sectionOfficer.addEmployee(emp4);
        engineer.addEmployee(emp3);
        engineer.addEmployee(emp5);
        engineer.addEmployee(emp6);

        Department hrDept = new Department("HR", "USA");
        hrDept.addPosition(manager);
        hrDept.addPosition(sectionOfficer);

        Department itDept = new Department("IT", "USA");
        itDept.addPosition(engineer);

        Company company = new Company("ABC Company");
        company.addDepartment(hrDept);
        company.addDepartment(itDept);

        company.print();
		
	}

}
