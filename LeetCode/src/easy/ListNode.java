package easy;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    // Method to insert a new node at the end of the list
    @SuppressWarnings("unused")
	public ListNode insertAtEnd(int val) {
        ListNode newNode = new ListNode(val);
        if (this == null) {
            return newNode;
        }
        ListNode current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return this;
    }

    // Method to print the elements of the list
    public void printList() {
        ListNode current = this;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }


    // Static method to insert a new node at the end of the list
    public static ListNode insertAtEnd(ListNode head, int val) {
        if (head == null) {
            return new ListNode(val);
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode(val);
        return head;
    }

    // Static method to print the elements of the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

  

