package referencemethod;

import java.util.function.BiFunction;

public class DefiningObject {
	public static void main(String[] args) {
	
		BiFunction<String, Integer, Person> creatingObject=Person::new;
		Person p1=creatingObject.apply("Binod",40);
		//using lamdas
		creatingObject=(x,y)->new Person(x, y);
		Person p2=creatingObject.apply("Ssagar",30);
		
		System.out.println(p1.toString());
		
		
	}
	

}

class Person{
	String name;
	int age;
	Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
}
