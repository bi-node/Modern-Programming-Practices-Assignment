package easy;

public class MergeTwoSingleList {

	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
	 * ListNode next) { this.val = val; this.next = next; } }
	 */
	public static void main(String[] args) {
		Node ll1 = new Node();
		ll1.add(6);
		ll1.add(1);
		ll1.add(20);
		Node ll2 = new Node();
		ll2.add(19);
		ll2.add(-5);
		ll2.add(1);
		Node node=mergeTwoLists(ll1, ll2);
		System.out.println(node.toString());
		
	}

	public static Node mergeTwoLists(Node list1, Node list2) {

		Node mergedList = new Node();
		mergedList.head = list1.head;
		Node temp = mergedList.head;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node temp2 = list2.head;
		while (temp2 != null) {
			list1.add(temp2.data);
			temp2 = temp2.next;
		}

		sorting(mergedList.head);
		
		return mergedList.head;
	

	}

	public static void sorting(Node n)
	{
		Node temp=n.head;
		
		while(temp!=null)
		{
			Node minNode=minimum(temp);
			swap(temp, minNode);
			temp=temp.next;
		
		}
		
		
	}
	
	public static Node minimum(Node head)
	{
		Node temp=head;
		int minValue=head.data;
		Node MinNode=head;
		while(temp!=null)
		{
			if(minValue>temp.data)
			{
				minValue=temp.data;
				MinNode=temp;
			}
			temp=temp.next;
		}
		
		return MinNode;
		
	}
	
	public static void swap(Node n1, Node n2)
	{
		 int temp = n1.data;
	        n1.data = n2.data;
	        n2.data = temp;
		
	}
}