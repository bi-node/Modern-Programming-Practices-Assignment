package easy;


public class LinkedListLeet {
    public static void main(String[] args) {
        Node ll = new Node();
        ll.add(4);
        ll.add(5);
        ll.add(7);
        ll.add(6);
        ll.add(4);
        ll.add(5);
        //ll.display();
        LinkedListLeet test = new LinkedListLeet();
        test.deleteDuplicates(ll.head);
        ll.display();

    }

    public Node deleteDuplicates(Node head) {
        Node temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }
        return temp;
    }
}


