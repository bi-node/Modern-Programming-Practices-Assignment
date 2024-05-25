package lesson9Stream.Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class Test2FindfirstAndAny {
	public static void main(String[] args) {
		// Array of random names
        String[] randomNames = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Ivy", "Jack"};

        // Creating a list to store Employee objects
        List<Employee> employeeList = new ArrayList<>();

        // Populating the list with 10 Employee objects with random names and salaries
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            String name = randomNames[random.nextInt(randomNames.length)];
            int salary = (random.nextInt(10) + 1) * 1000; // Generating random salary from 1000 to 10000
            Employee employee = new Employee(name, salary);
            employeeList.add(employee);
        }
        
      //findAnyEmployee with name letter 4 and salaray above 1500
    	Optional<Employee> query1=employeeList.stream()
    			.filter(x->x.getSalary()>1500&& x.getName().length()==4)
    			.findFirst();
    	
    	query1.ifPresentOrElse(System.out::println, ()->System.out.println("Not found using ifPresentOrElse"));
    	
    	
    	System.out.println("the : "+query1.map(Object::toString).orElse("Not found using optional.OrElse"));
    	
    	//Nullable
    	
    	String      xx= Optional.ofNullable(Test2FindfirstAndAny.readInput()).orElse("Shit");
    	System.out.println(xx);
   

	}
	
	public static String readInput()
	{
		return null;
		//return "Hello Binod";
	}
	
	
}
