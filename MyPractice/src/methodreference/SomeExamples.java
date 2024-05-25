package methodreference;

import java.security.PublicKey;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;


public class SomeExamples {
	public SomeExamples(int x) {
	
	}
	public static SomeExamples createObject()
	{
		return new SomeExamples(10);
	}
	public static void main(String[] args) {
		
		Function<String, Integer> parsing=Integer::parseInt;
		System.out.println(parsing.apply("251631"));
		
		Function<String, String> uppercase=String::toUpperCase;
		System.out.println(uppercase.apply("binod"));
		
		BiFunction<String, String, Integer> compareTO=String::compareTo;
		System.out.println(compareTO.apply("abc", "aef"));
		
		BiFunction<String, String, Boolean> equalCheck=Object::equals;
		System.out.println(equalCheck.apply("abc", "abc"));
		
		Supplier<SomeExamples> create=SomeExamples::createObject;
		create.get();
		
		
	}

}
