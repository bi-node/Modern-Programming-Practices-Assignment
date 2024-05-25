package lesson7.overrideequals.equalclassesstrategy2;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String n, double s) {
		super(n);
		salary = s;
	}
	
	public static void main(String[] args) {
		Person p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		System.out.println("p1.equals(p2)? "+(p1.equals(p2)));
		System.out.println("p1.equals(p2)? "+(p2.equals(p1)));
	}

}
