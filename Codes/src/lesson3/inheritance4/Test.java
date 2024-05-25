package lesson3.inheritance4;

public class Test {
	public static void main(String[] args) {
		ClassB a = new ClassA();
		a.setName("Renuka");
		System.out.println(a.getName());
		// Input is modified without knowing by A
		a.newMethod("Mohnaraj");
		System.out.println(a.getName());
	}

}
