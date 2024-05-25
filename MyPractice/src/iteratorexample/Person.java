package iteratorexample;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person implements Iterable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
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
    public Iterator<Person> iterator() {
        List<Person> list = new ArrayList<>();
        list.add(this); // Add the current Person object to the list
        return list.iterator();
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person("Bob", 35);

        // Iterating over multiple persons
        for (Person p : person1) {
            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
        }

        for (Person p : person2) {
            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
        }

        for (Person p : person3) {
            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
        }
    }
}
