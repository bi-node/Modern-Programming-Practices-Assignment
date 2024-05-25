package easy;


public class SortingList {
	public static void main(String[] args) {
		Node ll1 = new Node();
		ll1.add(6);
		ll1.add(1);
		ll1.add(20);
		ll1.add(-5);
		sorting(ll1);
		System.out.println(ll1.toString());
		
		
		
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
