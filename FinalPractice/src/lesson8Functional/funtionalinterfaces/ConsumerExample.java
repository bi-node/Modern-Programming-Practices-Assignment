package lesson8Functional.funtionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import lesson8Functional.comparator.Employee;

public class ConsumerExample {
	public static void main(String[] args) {
		List <Employee> listofEmployees=Arrays.asList(
				new Employee("Binod", 700),
				new Employee("Sagar", 600),
				new Employee("Kush", 550),
				new Employee("Suman", 575),
				new Employee("Sagar", 400)
				);
		Consumer<Employee> consumer=new Consumer<Employee>() {
			
			@Override
			public void accept(Employee t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		
		listofEmployees.forEach(consumer);
		
		//in lamdas this can be writter as
		System.out.println("Through lamdsas");
		listofEmployees.forEach(x->System.out.println(x));
	}

}
