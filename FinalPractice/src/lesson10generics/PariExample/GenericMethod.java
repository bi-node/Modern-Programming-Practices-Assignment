package lesson10generics.PariExample;

import java.util.Arrays;
import java.util.List;

public class GenericMethod {
	public static void main(String[] args) {
		Double[] arr = { 3.4, 6.4, 3.2, 3.4, 6.4, 3.2, 0.0, 3.2, 3.5, 3.4, 3.6 };
		System.out.println("The occorance of the given number is: " + countOccurences(arr, 3.2));

		List<String> listofString = Arrays.asList("poop", "pool", "pull", "pole", "push");
		System.out.println("The maximum is: " + max(listofString));

	}

	
	public static <T extends Comparable> T max(List<T> list) {
		T max = list.get(0);
		for (T t : list) {
			if (t.compareTo(max) > 0)
				max = t;
		}
		return max;

	}

	public static <T> int countOccurences(T[] arr, T target) {
		int count = 0;
		if (target == null) {
			for (T item : arr) {
				if (item == null)
					count++;
			}
		} else {
			for (T item : arr) {
				if (item.equals(target))
					count++;
			}
		}
		return count;
	}

}
