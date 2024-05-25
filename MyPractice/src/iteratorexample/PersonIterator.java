package iteratorexample;

import java.util.Iterator;


public class PersonIterator implements Iterable<PersonIterator> {
	private String name;
	private int age;

	PersonIterator(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public Iterator<PersonIterator> iterator() {

		return null;
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unused")
	private class PersonIterating implements Iterator<PersonIterator> {
		int index = 0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub

			return index == 0;
		}

		@Override
		public PersonIterator next() {
			// TODO Auto-generated method stub
			index++;
			return PersonIterator.this;

		}

	}
	public static void main(String[] args) {
		PersonIterator[] person= {new PersonIterator("Binod", 40),new PersonIterator("Abdun", 38),new PersonIterator("Phurpa", 42)};
		
		
		for(PersonIterator p: person)
		{
			System.out.println("Name: "+p.getName()+"------"+"Age: "+ p.getAge());
		}
	}
}
