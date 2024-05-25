package hashcodeetc;


import java.util.HashMap;

import java.util.Map;

public class Test {
	String string;
	int number;
	Test(String string, int number) {
		super();
		this.string = string;
		this.number = number;
	}
	public String getString() {
		return string;
	}
	public int getNumber() {
		return number;
	}
	@Override
	public int hashCode() {
		int result = 17;
		
		result += 31 * result + string.hashCode();
		result += 31 * result + number*10;
		
		return result;
	}

	
	public static void main(String[] args) {
		Test t1=new Test("abc", 1);
		Test t2=new Test("xyz", 2);
		Test t3=new Test("abc", 1);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		HashMap<Test, Test> testMap=new HashMap<Test, Test>();
		testMap.put(t1, t2);
		testMap.put(t2, t3);
		testMap.put(t1, t3);
		for(Map.Entry<Test, Test> it:testMap.entrySet())
		{
			System.out.println(it.getValue());
		}
		
		
	}

}
