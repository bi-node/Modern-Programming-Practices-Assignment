package comparableVsComparator;

import java.util.*;

class MyClassa {
    private int value;

    public MyClassa(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class MyComparator {
    public static void main(String[] args) {
        List<MyClassa> list = new ArrayList<>();
        list.add(new MyClassa(5));
        list.add(new MyClassa(3));
        list.add(new MyClassa(8));

        // Using Comparator to sort by value in descending order
        Comparator<MyClassa> comparator = new Comparator<MyClassa>() {
            @Override
            public int compare(MyClassa obj1, MyClassa obj2) {
                return Integer.compare(obj2.getValue(), obj1.getValue());
            }
        };

        Collections.sort(list, comparator);

        for (MyClassa obj : list) {
            System.out.println(obj.getValue());
        }
    }
}
