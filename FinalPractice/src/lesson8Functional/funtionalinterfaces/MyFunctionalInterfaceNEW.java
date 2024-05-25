package lesson8Functional.funtionalinterfaces;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MyFunctionalInterfaceNEW {
	public static void main(String[] args) {
		List<Integer> listOfIntegers=Arrays.asList(34,53,23,11,32,43,45,67,66,78);
		//consumer using lamda
		Consumer<Integer> con=(x)->System.out.println(x*2);
		for (Iterator<Integer> iterator = listOfIntegers.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			con.accept(integer);
			
		}
		
		//supplier using lamda
		Supplier<Integer> supplier=()->10;
		System.out.println(supplier.get());
		
		//function
		Function<Integer, Boolean> function=(x)->x%2==0;
		for (Integer integer : listOfIntegers) {
			System.out.println(function.apply(integer));
		}
	}

}
