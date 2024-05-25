package lesson8Functional.funtionalinterfaces;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MyFunctionalInterfaces {
	public static void main(String[] args) {
		List<Integer> listOfIntegers=Arrays.asList(34,53,23,11,32,43,45,67,66,78);
		
		Consumer<Integer> consumer=new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
				consumer.accept(10);
		
		//using function..with anonymous class implementaiton
		System.out.println("Function Interface");
		
		Function<Integer, Integer> function=new Function<>() {
			
			@Override
			public Integer apply(Integer t) {
					return t*10;
			}
		};
		
		for(Integer a:listOfIntegers)
		{
			System.out.println(function.apply(a));
		}
		
		
		//supplier
		Supplier<Integer> xSupplier=new Supplier<Integer>() {
			int x=10;
			
			@Override
			public Integer get() {
				// TODO Auto-generated method stub
				
				return x++;
			}
		};
		
		for(int i=1; i<10; i++)
		{
			System.out.println(xSupplier.get());
		}
		
		
	
		
	}

}
