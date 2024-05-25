package lesson9Stream.assignment;
import java.util.Arrays;
import java.util.List;

public class Prob3 {
	public static void main(String[] args) {
		
		List <String> listofword=Arrays.asList
				("apple", "banana", "pineapple", "Mango", "Peach", "Guava","apricot", "avocado");
		System.out.println("Answer: "+countWords(listofword, 'a', 'p', 5));
		
		
		
	}
	public static int countWords(List<String> words, char c, char d, int len)
	{
		
	return	(int) words.stream()
		.filter(x->x.length()>4 && x.indexOf(c)>=0 && x.indexOf(d)<0)
		.count();
		
		
		
	}

}
