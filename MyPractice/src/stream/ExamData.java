package stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class ExamData {
	String name;
	double score;
	ExamData(String name, double score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public double getScore() {
		return score;
	}
	
	public static void main(String[] args) {
		List<ExamData> list = new ArrayList<>();
        list.add(new ExamData("John", 85));
        list.add(new ExamData("Alice", 92));
        list.add(new ExamData("Bob", 78));
        list.add(new ExamData("Emma", 90));
        list.add(new ExamData("Michael", 85));
        list.add(new ExamData("Sophia", 88));
        list.add(new ExamData("William", 75));
        list.add(new ExamData("Olivia", 95));
        list.add(new ExamData("James", 82));
        list.add(new ExamData("Emily", 89));
        
        
        DoubleSummaryStatistics summary=list.stream()
        		.collect(Collectors.summarizingDouble(ExamData::getScore));
        
        System.out.println(summary.getAverage());
        
     
	}

}
