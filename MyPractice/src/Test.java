import java.util.stream.IntStream;

public class Test {
	public static void main(String[] args) {
		
		 IntStream.generate(() -> 1)
         .limit(10)
         .forEach(System.out::println);
		
		
		
	}

}
