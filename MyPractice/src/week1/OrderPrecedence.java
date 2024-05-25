package week1;


public class OrderPrecedence {
	int x;
	{
		System.out.println("Parent Instance Block");
	}
	static {
		System.out.println("Parent Static Block");

	}

	public OrderPrecedence() {
		// TODO Auto-generated constructor stub
		System.out.println("Parent Constructor with no arguments");
	}

	public OrderPrecedence(int x) {
		this.x = x;
		System.out.println("Parent constructure with argument"+x);
	}
	
	public static void main(String[] args) {
		new child();
		System.out.println("...............");
		new child(4, 5);

	}

}

 class child extends OrderPrecedence {
	int x, y;

	{
		System.out.println("Child Instance Block");
	}
	static {
		System.out.println("Child Static Block");
	}

	public child() {
		// TODO Auto-generated constructor stub
		System.out.println("Child no argument Constructur");
	}

	public child(int x, int y) {
		super(x);
		this.y = y;
		System.out.println("The value of x and y is: " + x + "Y:" + y);
	}

	

}
