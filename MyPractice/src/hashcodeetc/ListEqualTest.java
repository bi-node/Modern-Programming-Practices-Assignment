package hashcodeetc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEqualTest {
	private String name;
	private int salary;
	private boolean visited = false;

	public ListEqualTest(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	

	@Override
	public String toString() {
		return "ListEqualTest [name=" + name + ", salary=" + salary + ", visited=" + visited + "]";
	}


	public static void main(String[] args) {
		
		List<ListEqualTest> l1=Arrays.asList(new ListEqualTest("Richard", 55000),
				new ListEqualTest("John", 30000),
				new ListEqualTest("Steve", 30000),
				new ListEqualTest("Zeke", 50000),
				new ListEqualTest("Reggie", 50000));
		
		List<ListEqualTest> l2 = new ArrayList<ListEqualTest>() {
			private static final long serialVersionUID = 1L;

			{
				add(new ListEqualTest("Richard", 55000));
				add(new ListEqualTest("John", 30000));
				add(new ListEqualTest("Steve", 30000));
				add(new ListEqualTest("Zeke", 50000));
				add(new ListEqualTest("Reggie", 50000));
				
			}
		};

System.out.println(l1.equals(l2));
		}
}

