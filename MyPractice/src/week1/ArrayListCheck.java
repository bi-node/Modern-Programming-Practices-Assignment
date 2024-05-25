package week1;

import java.util.ArrayList;
import shoppingcart.*;

public class ArrayListCheck {
	public static void main(String[] args) {
		ArrayList<Items> items=new ArrayList<Items>();
		Items it1=new Items("Apples", 10, 3.5);
		Items it2=new Items("Bacon", 6, 2.98);
		Items it3=new Items("Bread", 10, 1.5);
		Items it4=new Items("Pizza", 4, 4.89);
		items.add(it1);
		items.add(it2);
		items.add(it3);
		items.add(it4);
		for(Items it: items)
		{
			System.out.println(it.getItemname());
		}
		
		
	}

}
