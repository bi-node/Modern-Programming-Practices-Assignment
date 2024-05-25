package lesson9Stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Statistics {
	public static void main(String[] args) {
		IntStream ins=IntStream.of(43,5,2,23,5,23,2,4,32,34);
		IntSummaryStatistics summaryStatistics=ins.summaryStatistics();
		System.out.println(summaryStatistics.getSum());
		

	}

}
