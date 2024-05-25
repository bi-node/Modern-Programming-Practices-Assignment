package lesson9Stream.assignment;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob1 {
	public static void main(String[] args) {
		Optional<String> list     = Stream.of("Bill", "Thomas", "Mary")
			.reduce((x,y)->x+", "+y);
		System.out.println(list.get());
	}

}
