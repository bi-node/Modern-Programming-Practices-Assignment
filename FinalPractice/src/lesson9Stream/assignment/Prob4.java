package lesson9Stream.assignment;

import java.util.stream.IntStream;

public class Prob4 {
	public static void main(String[] args) {
	Prob4.print(6);

	}
	
	public static void print(int num)
	{
		IntStream.iterate(1, x->x+1)
		.limit(num)
		.map(y->y*y)
		.forEach(System.out::println);
	}
}
