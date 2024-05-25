package comparableVsComparator;

import java.util.*;

class MyClass implements Comparable<MyClass> {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(MyClass other) {
        return Integer.compare(this.value, other.value);
    }
}

public class MyClassComparable {
    public static void main(String[] args) {
        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass(5));
        list.add(new MyClass(3));
        list.add(new MyClass(8));

        Collections.sort(list);

        for (MyClass obj : list) {
            System.out.println(obj.getValue());
        }
    }
}
