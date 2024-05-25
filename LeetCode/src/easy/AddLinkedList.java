package easy;

public class AddLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        n1.add(2);
        n1.add(4);
        n1.add(3);
        n2.add(5);
        n2.add(6);
        n2.add(4);
        AddLinkedList all = new AddLinkedList();
        all.addTwoNumbers(n1, n2);


    }

    public Node addTwoNumbers(Node l1, Node l2) {
        Node temp1 = l1.head;
        Node temp2 = l2.head;
        int nodeSum = 0;
        Node l3 = new Node();
        while (temp1 != null || temp2 != null) {
            nodeSum = temp1.data + temp2.data;
        }


        return null;

    }
}
