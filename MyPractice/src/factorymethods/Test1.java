package factorymethods;

public class Test1 {
	public static void display() {
		System.out.println("Parent Display");
	}

	public void print() {
		System.out.println("Parent print");
	}
	
}

class Child extends Test1
{
	public static void display()
	{
		System.out.println("Child display");
	}
	
	public void print()
	{
		System.out.println("Child Print");
	}
	
	public static void main(String[] args) {
	 Test1 t=new Child();
	 Test1.display();
	 
	 
	}
}
