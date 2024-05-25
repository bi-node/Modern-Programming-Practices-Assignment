package lesson9Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {
	public static void main(String[] args) {
		List<String> listofList=Arrays.asList("My","name","is","Binod", "Rasaili");
		String result=
		listofList.stream()
		.collect(Collectors.joining(" ,"));
		
		System.out.println(result);
	}

}
