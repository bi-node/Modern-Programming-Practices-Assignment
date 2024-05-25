package lesson8Functional;

import java.util.function.BiFunction;



public class FreeVariableExample {
	int x=10;
	
	
	public static void main(String[] args) {
		
		FreeVariableExample f=new FreeVariableExample();
		f.doSomething(5);
		f.doOtherthing();
		
	}
	
	public void doSomething(int y)  //y is local variable
	{
		int z=10;      //local variable
		BiFunction<Integer, Integer, Integer> function=(a,b)->
		{
			x=x+10;
			return a+b+z+y+x;     //x is instance variable
		};
		System.out.println(function.apply(2,3));
	}
	
	public void doOtherthing()
	{
		x=x+10;
		System.out.println("The value of x is: "+x);
	}

}
