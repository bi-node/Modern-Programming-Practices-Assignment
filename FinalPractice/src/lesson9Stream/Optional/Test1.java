package lesson9Stream.Optional;

import java.util.Optional;
import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {

	Stream<String> streamofFruit=Stream.of
				("apple", "banana", "orange", "grape", "pineapple", "kiwi", "mango", "strawberry", "kiwi", 
						"kiwi","watermelon", "banana");
	
	Optional<String> optMax=streamofFruit.max((x,y)->x.compareToIgnoreCase(y));
	if(optMax.isPresent())
	System.out.println("The largest String alphabetically: "+optMax.get());
	
	
	//printing out the second character of lagest string
	//ifPresent uses consumer class
		optMax.ifPresent(x->{
     char	y=x.charAt(2);
    		 System.out.println("The third character of largest string: "+y);
	});
		
		
		
	
		
		
	}

}
