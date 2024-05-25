package genericMethod;

public class GenericMethodTest {
	public static void main(String[] args) {
		
		Integer[] arr= {32,5,3,23,43,5,4,2,4,5,6};
		Integer targetInteger=5;
		System.out.println(countOccurences(arr, targetInteger));
		

	}

	public static <T> int countOccurences(T[] arr, T target) {
		int count = 0;
		if (target == null) {
			for (T item : arr)
				if (item == null)
					count++;
		} else {
			for (T item : arr)
				if (target.equals(item))
					count++;
		}
		return count;

	}

}
