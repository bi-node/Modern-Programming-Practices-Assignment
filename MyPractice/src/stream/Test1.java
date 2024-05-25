package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import javax.xml.stream.events.Namespace;

public class Test1 {
	public static void main(String[] args) {
		Stream.iterate(1, x->x+1)
		//.skip(3)
		.limit(5)
		.forEach(System.out::println);
		
		
		Stream<String> songStream=Stream.of("Hello", "Darkness", "my","old", "friend");
		
		Stream.iterate(1, x->x+2)
		.skip(4)
		.limit(4)
		.forEach(System.out::println);
		
		List<Integer> numbers=Arrays.asList(32,52,4,1,34,54,66,87,99);
		System.out.println("Sum of numbers using reduce stream");
		int sum1=numbers.stream()
				.reduce(0, (x,y)->x+y);
		System.out.println(sum1);
		
		//using reduce and optional
		System.out.println("Sum of numbers using reduce/optoinal combiled: ");
		Optional<Integer> sum2=numbers.stream()
				.reduce(Integer::sum);
		System.out.println(sum2.get());

	}

}
