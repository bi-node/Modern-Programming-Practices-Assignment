package lesson8.methodreferences;
import java.util.Comparator;
import java.util.function.*;
public class Examples {
	
	
	//type: Class::instanceMethod
	Function<String, String> upper1 = (String x) -> x.toUpperCase();
	Function<String, String> upper2 = String::toUpperCase;
	
	//type:  Class::instanceMethod
	Function<Employee, String> eToString1 = e -> e.getName();
	Function<Employee, String> eToString2 = Employee::getName;
	
	//type: Class::instanceMethod
	BiConsumer<Employee, String> setName1 = (e,s) -> e.setName(s);
	BiConsumer<Employee, String> setName2 = Employee::setName;
	
	//type: Class::instanceMethod
	Comparator<String> strComp1 = (s1,s2) -> s1.compareTo(s2);
	Comparator<String> strComp2 = String::compareTo;
	
	//type: Class::staticMethod
	BiFunction<Integer, Integer, Integer> min1 = (x,y) -> Math.min(x,y);
	BiFunction<Integer, Integer, Integer> min2 = Math::min;
	
	//type: Class::instanceMethod
	Function<Apple, Double> appleWeight1 = (Apple a) -> a.getWeight();
	Function<Apple, Double> appleWeight2 = Apple::getWeight;
	
	
	//type: Class::staticMethod
	Function<String, Integer> parser1 = x -> Integer.parseInt(x);
	Function<String, Integer> parser2 = Integer::parseInt;
	
	//type: obj::instanceMethod
	EmployeeNameComparator comp = new EmployeeNameComparator();
	Comparator<Employee> empComp1 = (e1, e2) -> comp.compare(e1,e2);
	Comparator<Employee> empComp2 = comp::compare;
	
	
	public void evaluator() {
		Employee testEmp = new Employee("John", 100000);
		Apple testApple = new Apple(4.5);
		System.out.println(upper2.apply("hello")); // Convert into Upper case
		System.out.println(eToString2.apply(testEmp)); // Get name from the Employee
		
		
		setName2.accept(testEmp,"Ralph");  // set the name in Employee class
		System.out.println(testEmp.getName());
		
		System.out.println(strComp2.compare("a", "b"));  // Compare the two strings and return int
		System.out.println(min2.apply(5,8)); // Find the minimum
		System.out.println(appleWeight2.apply(testApple)); //get the Apple Weight from Apple
		
				
		System.out.println(parser2.apply("15")); // Parse String to int
		
		System.out.println(empComp2.compare(testEmp, new Employee("John", 100000))); // compare two employee object and return int
		
	}
	
	public static void main(String[] args) {
		Examples e = new Examples();
		e.evaluator();
		
	}
	
	
	static class Apple {
		Apple(double weight) {
			this.weight = weight;
		}
		private double weight;
		public double getWeight() {
			return weight;
		}
	}
}
