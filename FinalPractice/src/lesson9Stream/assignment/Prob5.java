package lesson9Stream.assignment;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prob5 {
	public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
		return stream.skip(m).limit(n);
		}
	public static void main(String[] args) {
		// Make three calls for the streamSection() method with different inputs
		// use nextStream() method to supply the Stream input as a first argument in streamSection() method
		Stream<String> result1= streamSection( Prob5.nextStream(), 3, 5) ;
				System.out.println(result1.collect(Collectors.toList()));
		
		
		}
	//support method for the main method -- for testing
	private static Stream<String> nextStream() {
	return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
	}

}

