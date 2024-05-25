package lesson10generics.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Integersandall {
	public static void main(String[] args) {
			List<Number> list1=new ArrayList<Number>();
			List<Integer> list2=Arrays.asList(3,4,2,4);
			List<Double> list3=Arrays.asList(5.6,3.4);
			list1.addAll(list2);
			list1.addAll(list3);
			System.out.println(list1);
			//this works
			
			//but following doesnot work
			List<Integer> ints=Arrays.asList(3,4,2,4);
			List<? extends Number> numsList=ints;
			numsList.add(4.3);
			
			
			
			
			
	}

}
