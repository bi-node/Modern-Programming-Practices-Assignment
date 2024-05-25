package easy;

//Node 
class Node {
    int data;
    Node next;
    Node head = null;

    //add method
    public void add(int x) {
        Node n = new Node();
        n.data = x;
        if (isEmpty()) {

            head = n;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = n;
            n.next = null;
        }

    }
    // end of add method

    // start of dpublic void display() {

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }//end of display
    
    public String toString()
    {
    	StringBuilder sBuilder=new StringBuilder();
    	Node temp=head;
    	while(temp!=null)
    	{
    		sBuilder.append(temp.data+" ");
    		temp=temp.next;
    	}
    	
    	return sBuilder.toString();
    }
    
    
    

    // start of insert At first
    public void insertAtfirst(int data) {
        Node n = new Node();
        n.data = data;
        if (isEmpty()) {
            head = n;

        } else {
            {
                n.next = head;
                head = n;
            }
        }
    }

    //insert in position
    void insert(int data, int pos) {
        if (pos > size() || size() < 0)
            System.out.println("No position found");
        else {
            Node n = new Node();
            n.data = data;
            Node temp = head;
            if (pos == 0) {
                head = n;
            } else {
                for (int i = 1; i < pos; i++) {
                    temp = temp.next;
                }

                n.next = temp.next;
                temp.next = n;
            }

        }

    }

    // delete at last
    void deleteAtLast() {
        if (isEmpty())
            System.out.println("Linked List Empty");
        else {
            Node temp = head;
            for (int i = 1; i < size() - 1; i++) {
                temp = temp.next;
            }
            temp.next = null;

        }
    }

    // delete at first
    void deleteAtFirst() {
        if (isEmpty())
            System.out.println("Linked List Empty");
        else {
            Node temp = head;
            temp = temp.next;
            head = temp;
        }
    }

    // search operation
    boolean find(int x) {
        if (isEmpty())
            return false;
        else {
            Node temp = head;
            while (temp != null) {
                if (temp.data == x)
                    return true;
                temp = temp.next;
            }

            return false;
        }
    }

    // Empty linked list search
    boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

    int size() {

        Node temp = head;
        int counter = 0;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;

    }

    // remove duplicates
    public Node removeDuplicates(Node h) {
        if (h == null || h.next == null)
            return h;
        Node current = h;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return h;
    }
}

//Linked List class
public class LinkedList {

    public static void main(String[] args) {
        Node ll = new Node();
        ll.add(4);
        ll.add(4);
        ll.add(5);
        ll.add(5);
        ll.add(6);
        ll.add(6);
        ll.removeDuplicates(ll.head);
        ll.display();
        
        System.out.println("Head");
        System.out.println(ll.head.data);

    }
}
