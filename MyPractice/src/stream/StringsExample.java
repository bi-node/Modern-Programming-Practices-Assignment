package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringsExample {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("My", "Name", "is", "Binod", "Rasaili");
		List<String> words1 = Arrays.asList("My", "Name", "is", "Binod", "Rasaili");
		List<Integer> listLength = words.stream().map(String::length).collect(Collectors.toList());
		System.out.println("The length of words: " + listLength);

		List<String> upperList = words.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println("The Upper case list: " + upperList);

		// even length word list
		List<String> evenLenString = Arrays.stream(words.toArray(new String[0])).filter(x -> x.length() % 2 == 0)
				.collect(Collectors.toList());

		System.out.println("The even list String" + evenLenString);

//		//or we can print in arrays
////		
		String[] oddLenString = Arrays.stream(words.toArray(new String[0])).filter(x -> x.length() % 2 == 1)
				.toArray(String[]::new);
		System.out.println(Arrays.toString(oddLenString));

		// square root of all listed integer
		Integer[] arraysofInteger = { 3, 1, 4, 9, 12, 17, 2 };

		// int[] doesnot work here
		List<Double> squarerootlist = Arrays.stream(arraysofInteger).map(x -> Math.sqrt(x))
				.collect(Collectors.toList());
		System.out.println("The square root list " + squarerootlist);

		// factorial recursive
		Function<Integer, Integer> factorial = (x -> x = x + 10);

		System.out.println(factorial.apply(20));

		// flat map
		Stream.of(1, 4, 3, 2).flatMap(n -> Stream.of(n, n * n)).forEach(x -> System.out.print(x + " "));
		System.out.println();
		// flat 2arrays
		List<List<Integer>> listOfList = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(5, 7));
		Stream<Integer> flattendStream = listOfList.stream() // stream of List<Integer>
				.flatMap(List -> List.stream());

		List<Integer> res = flattendStream.collect(Collectors.toList()); // collection all into list
		System.out.println("Flattened output " + res);

		List<String> len = words.stream().sorted(Comparator.comparing(String::length).reversed())
				//
				.collect(Collectors.toList());
		System.out.println(len);
	}
}
