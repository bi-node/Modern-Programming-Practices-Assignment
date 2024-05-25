package lesson9Stream.assignment;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prob2 {
	public static void main(String[] args) {
		IntStream myIntStream=IntStream.of(4,52,5,4,2,34,-5,5,235,3,52,343);
		IntSummaryStatistics summaryStatistics=myIntStream.summaryStatistics();
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getCount());
		
		
		//other way
		List<Integer> myIntStream1=Arrays.asList(4,52,5,4,2,34,-5,5,235,3,52,343);
		List<Integer> sortedList=
		myIntStream1.stream().sorted().collect(Collectors.toList());
		
		
		
	}

}
