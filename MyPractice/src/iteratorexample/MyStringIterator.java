package iteratorexample;


import java.util.Iterator;
import java.util.function.Consumer;

public class MyStringIterator implements Iterable<String>{
	private int size;
	private String[] str;
	private static final int INITIAL_LENGHT = 3;

	public MyStringIterator() {
		// TODO Auto-generated constructor stub
		str = new String[INITIAL_LENGHT];
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void resize() {
		System.out.println("Resizing");
		int len = size() + 5;
		String[] temp = new String[len];
		System.arraycopy(str, 0, temp, 0, size());

		str = temp;
	}

	public int size() {
		return size;
	}

	public void add(String s) {
		if (size() >= str.length)
			resize();

		str[size++] = s;

	}
	
	public String[] getString()
	{
		return str;
	}

	public void remove() {

		if (size < 1) {
			System.out.println("Empty List");
		} else {
			size--;
			String[] temp = new String[size()];
			System.arraycopy(str, 0, temp, 0, size());
			str = temp;
		}
	}

	@Override
	public String toString() {

		if (size() < 1)
			return null;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < size() - 1; i++) {
			sb.append(str[i] + " , ");
		}
		sb.append(str[size() - 1] + "]");

		return sb.toString();

	}

	public static void main(String[] args) {
		MyStringIterator ms = new MyStringIterator();
		ms.add("Sabi");
		ms.add("Ram");
		ms.add("Toyam");
		ms.add("Hari");
		
		System.out.println("Using iterator----");
		Iterator<String> iterator=ms.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		System.out.println("---using for each---");
		for(Object o: ms)
		{
			System.out.println(o.toString());
		}
		
		System.out.println("---using new For each----");
		Consumer<String> consumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println(s);				
			}	
		};
		ms.forEach(consumer);
	
	}
	
	private class StringListIterator implements Iterator<String>
	{
		int index=0;
		String[] temp=getString();

		@Override
		public boolean hasNext() {
		    return index<size;
			
		}

		@Override
		public String next() {
			
			
				String st=temp[index++];
				return st;
			
		}
		
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new StringListIterator();
		
	}

}
