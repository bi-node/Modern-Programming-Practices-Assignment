package lesson9Stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InstreamExample {
	public static void main(String[] args) {
		IntStream ins=IntStream.of(4,5,65,4,3,2);
		IntStream gens= IntStream.generate(()->1).limit(10);
		gens.forEach(System.out::println);
		
		IntStream no=IntStream.iterate(1, n->n+1).limit(10);
		no.forEach(System.out::println);
		
		IntStream zero=IntStream.rangeClosed(0, 100);
		zero.forEach(System.out::println);
		
		//convert primitive to stream of object
		Stream<Integer> object=IntStream.range(0,5).boxed();
		object.forEach(System.out::println);
		
	}

}
